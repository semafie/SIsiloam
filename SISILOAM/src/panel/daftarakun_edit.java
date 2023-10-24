/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import entity.user;
import java.awt.Font;
import javax.swing.SwingUtilities;
import main.main;
import repository.userRepository;
import view.swing.validasiberhasil;

/**
 *
 * @author RESCOM-1
 */
public class daftarakun_edit extends javax.swing.JPanel {
    userRepository ab = new userRepository();
    daftarakun c = new daftarakun();
    private int ids = c.id;
    /**
     * Creates new form daftarakun_edit
     */
    public daftarakun_edit() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 22);
        txt_id.setFont(font);
        txt_email.setFont(font);
        txt_password.setFont(font);
        txt_username.setFont(font);
        txt_id.setText(String.valueOf(ab.get(ids).getId()));
        txt_username.setText(ab.get(ids).getUsername());
        txt_password.setText(ab.get(ids).getPassword());
        txt_email.setText(ab.get(ids).getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnbatal = new javax.swing.JLabel();
        btnselanjutnya = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setLayout(null);

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
        btnbatal.setBounds(10, 700, 150, 60);

        btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png"))); // NOI18N
        btnselanjutnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnselanjutnyaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnselanjutnyaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnselanjutnyaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnselanjutnyaMousePressed(evt);
            }
        });
        add(btnselanjutnya);
        btnselanjutnya.setBounds(1110, 700, 250, 60);

        txt_id.setBackground(new Color(0,0,0,0));
        txt_id.setBorder(null);
        add(txt_id);
        txt_id.setBounds(490, 300, 480, 40);

        txt_username.setBackground(new Color(0,0,0,0));
        txt_username.setBorder(null);
        add(txt_username);
        txt_username.setBounds(490, 390, 480, 40);

        txt_password.setBackground(new Color(0,0,0,0));
        txt_password.setBorder(null);
        add(txt_password);
        txt_password.setBounds(490, 480, 480, 40);

        txt_email.setBackground(new Color(0,0,0,0));
        txt_email.setBorder(null);
        add(txt_email);
        txt_email.setBounds(490, 580, 480, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg edit user.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    main wow = (main)SwingUtilities.getWindowAncestor(this);
        this.setVisible(false);
        wow.showdaftar_akun();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btnselanjutnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseClicked
        try {
            user apa = new user(ids, txt_username.getText(), txt_password.getText(), txt_email.getText());
            ab.update(apa);
            main wow = (main)SwingUtilities.getWindowAncestor(this);
            this.setVisible(false);
            wow.showdaftar_akun();
            validasiberhasil ac = new validasiberhasil(wow, "Data Berhasil Di edit");
            ac.showPopUp();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnselanjutnyaMouseClicked

    private void btnselanjutnyaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseEntered
    btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya2.png")));
    }//GEN-LAST:event_btnselanjutnyaMouseEntered

    private void btnselanjutnyaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseExited
    btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png")));
    }//GEN-LAST:event_btnselanjutnyaMouseExited

    private void btnselanjutnyaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMousePressed
    btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya3.png")));
    }//GEN-LAST:event_btnselanjutnyaMousePressed

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal2_1.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal1_1.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal3_1.png")));
    }//GEN-LAST:event_btnbatalMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnselanjutnya;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}