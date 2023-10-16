/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import entity.data_dokter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.main;
import repository.data_dokterRepository;

/**
 *
 * @author semafie
 */
public class datadokter extends javax.swing.JPanel {
    data_dokterRepository datadokter = new data_dokterRepository();
    /**
     * Creates new form datadokter
     */
    public datadokter() {
        initComponents();
        load_tabel();
    }
    public void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO_ID_DOKTER");
        model.addColumn("NAMA");
        model.addColumn("NO_HP");
        model.addColumn("JENISPOLI");
        model.addColumn("JADWAL");
        
        try {
            for(data_dokter apa:datadokter.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getNama(),
                    apa.getNo_hp(),
                    apa.getJenis_poli(),
                    apa.getJadwal()
                    
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        btnkembali = new javax.swing.JLabel();
        btntambah = new javax.swing.JLabel();
        btnedit = new javax.swing.JLabel();
        btnedit1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(null);

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
        jScrollPane1.setBounds(70, 250, 1240, 390);

        btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali1.png"))); // NOI18N
        btnkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkembaliMouseClicked(evt);
            }
        });
        add(btnkembali);
        btnkembali.setBounds(10, 710, 190, 51);

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntambah1.png"))); // NOI18N
        add(btntambah);
        btntambah.setBounds(40, 129, 200, 70);

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit1.png"))); // NOI18N
        add(btnedit);
        btnedit.setBounds(260, 130, 200, 70);

        btnedit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus1.png"))); // NOI18N
        add(btnedit1);
        btnedit1.setBounds(480, 130, 200, 70);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg datamaster.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdatadokter();
    }//GEN-LAST:event_btnkembaliMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnedit;
    private javax.swing.JLabel btnedit1;
    private javax.swing.JLabel btnkembali;
    private javax.swing.JLabel btntambah;
    private javax.swing.JScrollPane jScrollPane1;
    private view.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
