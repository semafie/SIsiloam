/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import javax.swing.SwingUtilities;
import main.main;
import repository.datapasienbarusementara;
//import static panel.pasienbaru.jnk;
//import static panel.pasienbaru.txt_alamat;
//import static panel.pasienbaru.txt_nama_pasien;
//import static panel.pasienbaru.txt_nik;
//import static panel.pasienbaru.txt_no_rm;
//import static panel.pasienbaru.txt_ttl;


/**
 *
 * @author RESCOM-1
 */
public class pasienbaru_pilihpoli1 extends javax.swing.JPanel {
    
    
    /**
     * Creates new form pasienbaru_pilihpoli
     */
    
    
    public pasienbaru_pilihpoli1() {
        initComponents();
        datapasienbarusementara a = new datapasienbarusementara();
        System.out.println(a.getNama());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlanjut = new javax.swing.JLabel();
        btnbatal = new javax.swing.JLabel();
        itempoli_tampilan1 = new view.swing.itempoli_tampilan();
        bg = new javax.swing.JLabel();

        setLayout(null);

        btnlanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png"))); // NOI18N
        btnlanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlanjutMouseClicked(evt);
            }
        });
        add(btnlanjut);
        btnlanjut.setBounds(1110, 701, 250, 60);

        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali1.png"))); // NOI18N
        btnbatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbatalMouseClicked(evt);
            }
        });
        add(btnbatal);
        btnbatal.setBounds(10, 701, 190, 60);
        add(itempoli_tampilan1);
        itempoli_tampilan1.setBounds(230, 230, 490, 390);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg pilih poli.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnlanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlanjutMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showpasienbaru_pilihdokter1();
    }//GEN-LAST:event_btnlanjutMouseClicked

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    
        
//    o.apek();
//        o.txt_no_rm.setText("gghfhf");
//        o.txt_nama_pasien.setText("vgvggvghvv");
//        o.txt_alamat.setText(nik1);
//        o.txt_nik.setText(ttl1);
//        o.txt_ttl.setText(alamat1);
//        if (jnk1.equals("Laki - Laki")) {
//            o.cmd_jnk.setSelectedIndex(0);
//        } else {
//            o.cmd_jnk.setSelectedIndex(1);
//        }
        main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showpasienlama();
    }//GEN-LAST:event_btnbatalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnlanjut;
    private view.swing.itempoli_tampilan itempoli_tampilan1;
    // End of variables declaration//GEN-END:variables
}
