/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import javax.swing.SwingUtilities;
import main.main;

/**
 *
 * @author Be Mine
 */
public class pasienbaru_pilihdokter extends javax.swing.JPanel {

    /**
     * Creates new form pilihdokter
     */
    public pasienbaru_pilihdokter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnselanjutnya = new javax.swing.JLabel();
        btnkembali = new javax.swing.JLabel();
        itemdokter_tampilann1 = new view.swing.itemdokter_tampilann();
        bgpilihdokter = new javax.swing.JLabel();

        setLayout(null);

        btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png"))); // NOI18N
        btnselanjutnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnselanjutnyaMouseClicked(evt);
            }
        });
        add(btnselanjutnya);
        btnselanjutnya.setBounds(1080, 695, 250, 60);

        btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali1.png"))); // NOI18N
        btnkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkembaliMouseClicked(evt);
            }
        });
        add(btnkembali);
        btnkembali.setBounds(10, 690, 210, 60);
        add(itemdokter_tampilann1);
        itemdokter_tampilann1.setBounds(198, 220, 970, 450);

        bgpilihdokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg pilih dokter.png"))); // NOI18N
        add(bgpilihdokter);
        bgpilihdokter.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showpasienbaru_pilihpoli();
    }//GEN-LAST:event_btnkembaliMouseClicked

    private void btnselanjutnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showpasienbaru_tambahdaftar();
    }//GEN-LAST:event_btnselanjutnyaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgpilihdokter;
    private javax.swing.JLabel btnkembali;
    private javax.swing.JLabel btnselanjutnya;
    private view.swing.itemdokter_tampilann itemdokter_tampilann1;
    // End of variables declaration//GEN-END:variables
}
