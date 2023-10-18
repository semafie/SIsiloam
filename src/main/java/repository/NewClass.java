/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.regex.Pattern;

public class NewClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Search JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Kolom-kolom dalam tabel
        String[] columnNames = {"ID", "Nama", "Jenis Kelamin"};

        // Data awal
        Object[][] data = {
            {1, "John", "Laki-Laki"},
            {2, "Jane", "Perempuan"},
            {3, "Bob", "Laki-Laki"},
            {4, "Alice", "Perempuan"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable jTable = new JTable(tableModel);

        // Panel pencarian
        JPanel searchPanel = new JPanel();
        JTextField searchField = new JTextField(10);

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                search();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                search();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                search();
            }

            private void search() {
                String searchTerm = searchField.getText().toLowerCase();

                for (int row = 0; row < jTable.getRowCount(); row++) {
                    boolean matchFound = false;
                    for (int col = 0; col < jTable.getColumnCount(); col++) {
                        Object cellValue = jTable.getValueAt(row, col);
                        if (cellValue != null && cellValue.toString().toLowerCase().contains(searchTerm)) {
                            matchFound = true;
                            break;
                        }
                    }
                    if (matchFound) {
                        jTable.addRowSelectionInterval(row, row);
                    }
                }
            }
        });

        searchPanel.add(new JLabel("Cari: "));
        searchPanel.add(searchField);

        frame.add(searchPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(jTable), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
