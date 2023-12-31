/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Font;
import com.lowagie.text.Phrase;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import javax.swing.table.DefaultTableModel;
import repository.rekap_harianRepository;
import entity.rekap_harian;
import java.awt.Color;
//import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import main.main;
import repository.data_dokterRepository;
import repository.data_masterRepository;
import util.Conn;
import view.swing.validasiberhasil;
        

/**
 *
 * @author semafie
 */
public class rekapharian1 extends javax.swing.JPanel {
    rekap_harianRepository gege = new rekap_harianRepository();
    data_dokterRepository gege1 = new data_dokterRepository();
    data_masterRepository gege2 = new data_masterRepository();
    main main =(main)SwingUtilities.getWindowAncestor(this);
    private int id;
    private int id1;
    Date date;
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    /**
     * Creates new form rekap_harian
     */
    public rekapharian1() {
        initComponents();
        load_tabel2();
        DefaultCellEditor cellEditor = new DefaultCellEditor(new JTextField()) {
    @Override
    public boolean isCellEditable(EventObject e) {
        return false;
    }
};
        table.setDefaultEditor(Object.class, cellEditor);
    }
    public void load_tabel(){
        
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NO RM");
        model.addColumn("NAMA PASIEN");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("NAMA DOKTER");
        model.addColumn("JENIS POLI");
        model.addColumn("TANGGAL");
        model.addColumn("JAM");
        try {
            for(rekap_harian apa:gege.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getData_master().getNo_rm(),
                    apa.getData_master().getNama(),
                    apa.getData_master().getJenis_kelamin(),
                    apa.getData_dokter().getNama(),
                    apa.getData_dokter().getJenis_poli(),
                    apa.getTanggal(),
                    timeFormat.format(new Date(apa.getJam().getTime()))
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void load_tabel2(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NO RM");
        model.addColumn("NAMA PASIEN");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("NAMA DOKTER");
        model.addColumn("JENIS POLI");
        model.addColumn("TANGGAL");
        
        model.addColumn("JAM");
        
        try {
        String sql = "SELECT * FROM rekap_harian "
                + "join data_dokter on rekap_harian.id_dokter = data_dokter.id "
                + "join data_master on rekap_harian.id_master = data_master.id "
                + "ORDER BY rekap_harian.id";
        Connection koneksi = (Connection)Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(sql);

        ResultSet res = pst.executeQuery();

        while (res.next()) {
            model.addRow(new Object[]{
                res.getInt("id"),
                res.getString("no_rm"),
                res.getString("nama1"),
                res.getString("jenis_kelamin1"),
                res.getString("nama"),
                res.getString("jenis_poli"),
                res.getDate("tanggal"),
                res.getTime("jam")
            });
        }

        table.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    public static void convertJTableToPDF(JTable jTable) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan sebagai PDF");
    fileChooser.setFileFilter(new FileNameExtensionFilter("File PDF", "pdf"));

    int userSelection = fileChooser.showSaveDialog(null);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";
        Document document = new Document(PageSize.A4.rotate());

        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
            // Tambahkan judul laporan
                Paragraph title = new Paragraph("LAPORAN REKAP HARIAN RS SILOAM", new Font(Font.BOLD, 18, Font.NORMAL));
                title.setAlignment(Element.ALIGN_CENTER);
                document.add(title);
                
                Paragraph title1 = new Paragraph(" ", new Font(Font.BOLD, 18, Font.NORMAL));
                title1.setAlignment(Element.ALIGN_CENTER);
                document.add(title1);
                
                
                
                
                // Tambahkan tanggal hari ini
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String currentDate = "Tanggal: " + sdf.format(new Date()) ;
                Paragraph date = new Paragraph(currentDate, new Font(Font.BOLD, 12, Font.NORMAL));
                date.setAlignment(Element.ALIGN_RIGHT);
                document.add(date);
                
                Paragraph title2 = new Paragraph(" ", new Font(Font.BOLD, 20, Font.NORMAL));
                title2.setAlignment(Element.ALIGN_CENTER);
                document.add(title2);
                
                date.setSpacingAfter(25);
            
            PdfPTable pdfTable = new PdfPTable(jTable.getColumnCount());
            
            pdfTable.getDefaultCell().setBorderColor(new Color(219,219,219));
            
            pdfTable.setTotalWidth(PageSize.A4.getHeight());

            // Mengisi header tabel PDF dengan nama kolom dari JTable
            for (int i = 0; i < jTable.getColumnCount(); i++) {
//                pdfTable.addCell(jTable.getColumnName(i));
                PdfPCell cell = new PdfPCell(new Phrase(jTable.getColumnName(i)));
                    cell.setBackgroundColor(new Color(95,193,193)); // Warna latar belakang
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER); // Pusatkan teks
                    cell.setPadding(1);
                    cell.setBorderColor(Color.WHITE);
                    pdfTable.addCell(cell);
            }
//            float[] columnWidths = {1f, 1.5f, 2f, 1.5f}; // Sesuaikan lebar kolom sesuai kebutuhan
//                pdfTable.setWidths(columnWidths);


            // Mengisi data dari JTable ke tabel PDF
            for (int i = 0; i < jTable.getRowCount(); i++) {
                for (int j = 0; j < jTable.getColumnCount(); j++) {
                    pdfTable.addCell(jTable.getValueAt(i, j).toString());
                }
            }

            document.add(pdfTable);
            document.close();
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan PDF", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menyimpan PDF", "Error", JOptionPane.ERROR_MESSAGE);

        }   
    }
}
    public void load_search(String search) {
    DefaultTableModel model = new DefaultTableModel();
    
        model.addColumn("ID");
        model.addColumn("NO RM");
        model.addColumn("NAMA PASIEN");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("NAMA DOKTER");
        model.addColumn("JENIS POLI");
        model.addColumn("TANGGAL");
        
        model.addColumn("JAM");
    
    try {
        String sql = "SELECT * FROM rekap_harian "
                + "join data_dokter on rekap_harian.id_dokter = data_dokter.id "
                + "join data_master on rekap_harian.id_master = data_master.id "
                + "where rekap_harian.id LIKE ? OR data_master.no_rm LIKE ? "
                + "OR data_master.nama1 LIKE ? OR rekap_harian.tanggal LIKE ?";
        Connection koneksi = (Connection)Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(sql);
        pst.setString(1, "%" + search + "%");
        pst.setString(2, "%" + search + "%");
        pst.setString(3, "%" + search + "%");
        pst.setString(4, "%" + search + "%");

        ResultSet res = pst.executeQuery();

        while (res.next()) {
            model.addRow(new Object[]{
                res.getInt("id"),
                res.getString("no_rm"),
                res.getString("nama1"),
                res.getString("jenis_kelamin1"),
                res.getString("nama"),
                res.getString("jenis_poli"),
                res.getDate("tanggal"),
                res.getTime("jam")
            });
        }

        table.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        btnbatal = new javax.swing.JLabel();
        btncetak = new javax.swing.JLabel();
        text_search = new javax.swing.JTextField();
        ffff = new javax.swing.JLabel();
        scrollBarCustom1 = new view.swing.ScrollBarCustom();
        bg = new javax.swing.JLabel();

        setLayout(null);

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBar(scrollBarCustom1);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 200, 1190, 400);

        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal1_1.png"))); // NOI18N
        btnbatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbatalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbatalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbatalMousePressed(evt);
            }
        });
        add(btnbatal);
        btnbatal.setBounds(10, 700, 200, 60);

        btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetak1.png"))); // NOI18N
        btncetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncetakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncetakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncetakMousePressed(evt);
            }
        });
        add(btncetak);
        btncetak.setBounds(1160, 700, 200, 60);

        text_search.setBackground(new Color(0,0,0,0));
        text_search.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        text_search.setBorder(null);
        text_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_searchKeyReleased(evt);
            }
        });
        add(text_search);
        text_search.setBounds(970, 150, 300, 40);

        ffff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg search.png"))); // NOI18N
        add(ffff);
        ffff.setBounds(960, 140, 330, 55);

        scrollBarCustom1.setForeground(new java.awt.Color(0, 102, 102));
        add(scrollBarCustom1);
        scrollBarCustom1.setBounds(1290, 200, 8, 400);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg rekap harian.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdasboard();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal2_1.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal1_1.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal3_1.png")));
    }//GEN-LAST:event_btnbatalMousePressed

    private void btncetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseClicked
        convertJTableToPDF(table);
    }//GEN-LAST:event_btncetakMouseClicked

    private void text_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_searchKeyReleased
        load_search(text_search.getText());
    }//GEN-LAST:event_text_searchKeyReleased

    private void btncetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseEntered
    btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetak2.png")));
    }//GEN-LAST:event_btncetakMouseEntered

    private void btncetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseExited
    btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetak1.png")));
    }//GEN-LAST:event_btncetakMouseExited

    private void btncetakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMousePressed
    btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetak3.png")));
    }//GEN-LAST:event_btncetakMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btncetak;
    private javax.swing.JLabel ffff;
    private javax.swing.JScrollPane jScrollPane1;
    private view.swing.ScrollBarCustom scrollBarCustom1;
    private view.swing.Table table;
    private javax.swing.JTextField text_search;
    // End of variables declaration//GEN-END:variables
}
