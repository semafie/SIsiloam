/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import javax.swing.SwingUtilities;
import main.main;

/**
 *
 * @author semafie
 */
public class Dasboardowner extends javax.swing.JPanel {

    /**
     * Creates new form dasboardowner
     */
    public Dasboardowner() {
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

        btndaftarakun = new javax.swing.JLabel();
        btnlogout = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(null);

        btndaftarakun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_daftarakun1.png"))); // NOI18N
        btndaftarakun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndaftarakunMouseClicked(evt);
            }
        });
        add(btndaftarakun);
        btndaftarakun.setBounds(260, 160, 420, 100);

        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogout1.png"))); // NOI18N
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });
        add(btnlogout);
        btnlogout.setBounds(20, 700, 180, 51);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg dasboard.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        main main =(main)SwingUtilities.getWindowAncestor(this);
        this.setVisible(false);
        main.showlogin();
    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btndaftarakunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndaftarakunMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
        this.setVisible(false);
        main.showdaftar_akun();
    }//GEN-LAST:event_btndaftarakunMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btndaftarakun;
    private javax.swing.JLabel btnlogout;
    // End of variables declaration//GEN-END:variables
}
