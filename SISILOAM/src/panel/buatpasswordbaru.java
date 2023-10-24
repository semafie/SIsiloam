/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingUtilities;
import main.main;
import service.Auth;
import view.swing.validasiberhasil;
/**
 *
 * @author RESCOM-1
 */
public class buatpasswordbaru extends javax.swing.JPanel {

    /**
     * Creates new form buatpasswordbaru
     */
    private static boolean isHidden = true;
    private static boolean isHidden1 = true;
    Auth a = new Auth();
    verifikasi ab = new verifikasi();
    private String username = a.username;
    public buatpasswordbaru() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 22);
        inputpassword1.setFont(font);
        inputpassword2.setFont(font);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnubahpassword = new javax.swing.JLabel();
        inputpassword2 = new javax.swing.JPasswordField();
        inputpassword1 = new javax.swing.JPasswordField();
        eye1 = new javax.swing.JLabel();
        eye2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(null);

        btnubahpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnubahpass1.png"))); // NOI18N
        btnubahpassword.setText("jLabel1");
        btnubahpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnubahpasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnubahpasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnubahpasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnubahpasswordMousePressed(evt);
            }
        });
        add(btnubahpassword);
        btnubahpassword.setBounds(410, 520, 560, 70);

        inputpassword2.setBackground(new java.awt.Color(227, 252, 246));
        inputpassword2.setBorder(null);
        add(inputpassword2);
        inputpassword2.setBounds(480, 390, 360, 40);

        inputpassword1.setBackground(new java.awt.Color(227, 252, 246));
        inputpassword1.setBorder(null);
        add(inputpassword1);
        inputpassword1.setBounds(480, 310, 360, 40);

        eye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye1.png"))); // NOI18N
        eye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye1MouseClicked(evt);
            }
        });
        add(eye1);
        eye1.setBounds(900, 310, 50, 40);

        eye2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye1.png"))); // NOI18N
        eye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye2MouseClicked(evt);
            }
        });
        add(eye2);
        eye2.setBounds(900, 390, 50, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/ubah password.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnubahpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnubahpasswordMouseClicked
    String pass = inputpassword1.getText();
    String repeatPass = inputpassword2.getText();
        if(pass.equals(repeatPass)){
              boolean changePassword = a.changePass(pass, repeatPass, username);
        if(changePassword){
            System.out.println("berhasil");
            System.out.println(username);
            a.username = "";
            this.setVisible(false);
            main main1 =(main)SwingUtilities.getWindowAncestor(this);
            main1.showlogin();
            validasiberhasil aa = new validasiberhasil(main1,"Anda Berhasil Merubah password");
            aa.showPopUp();    
        }else{
            System.out.println("gagal");
        }
        }else{
            System.out.println("Tidak sama");
        }
    }//GEN-LAST:event_btnubahpasswordMouseClicked

    private void eye2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye2MouseClicked
        if (isHidden1) {
            inputpassword2.setEchoChar((char) 0);
            //            toggleButton.setText("Hide Password");
            eye2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye2.png")));
            isHidden1 = false;
        } else {
            inputpassword2.setEchoChar('*');
            eye2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye1.png")));
            //            toggleButton.setText("Show Password");
            isHidden1 = true;
        }
    }//GEN-LAST:event_eye2MouseClicked

    private void eye1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye1MouseClicked
    if (isHidden) {
            inputpassword1.setEchoChar((char) 0);
            //            toggleButton.setText("Hide Password");
            eye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye2.png")));
            isHidden = false;
        } else {
            inputpassword1.setEchoChar('*');
            eye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye1.png")));
            //            toggleButton.setText("Show Password");
            isHidden = true;
        }
    }//GEN-LAST:event_eye1MouseClicked

    private void btnubahpasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnubahpasswordMouseEntered
    btnubahpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnubahpass2.png"))); 
    }//GEN-LAST:event_btnubahpasswordMouseEntered

    private void btnubahpasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnubahpasswordMouseExited
    btnubahpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnubahpass1.png"))); 
    }//GEN-LAST:event_btnubahpasswordMouseExited

    private void btnubahpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnubahpasswordMousePressed
    btnubahpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnubahpass3.png"))); 
    }//GEN-LAST:event_btnubahpasswordMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnubahpassword;
    private javax.swing.JLabel eye1;
    private javax.swing.JLabel eye2;
    private javax.swing.JPasswordField inputpassword1;
    private javax.swing.JPasswordField inputpassword2;
    // End of variables declaration//GEN-END:variables
}