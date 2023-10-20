/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingUtilities;
import main.main;
//import main.main;
import repository.userRepository;
import service.Auth;
import view.swing.validasiberhasil;



public class Login extends javax.swing.JPanel {
    userRepository ret = new userRepository();
    private static boolean isHidden = true;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 22);
        inputusername.setFont(font);
        inputpassword.setFont(font);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnlogin = new javax.swing.JLabel();
        inputpassword = new javax.swing.JPasswordField();
        inputusername = new javax.swing.JTextField();
        txtubahpass = new javax.swing.JLabel();
        eye = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setLayout(null);

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin1.png"))); // NOI18N
        btnlogin.setText("jLabel2");
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnloginMousePressed(evt);
            }
        });
        add(btnlogin);
        btnlogin.setBounds(410, 520, 550, 70);

        inputpassword.setBackground(new Color(0,0,0,0)
        );
        inputpassword.setBorder(null);
        add(inputpassword);
        inputpassword.setBounds(490, 390, 390, 40);

        inputusername.setBackground(new Color(0,0,0,0));
        inputusername.setBorder(null);
        add(inputusername);
        inputusername.setBounds(490, 310, 390, 40);

        txtubahpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Lupa password_1.png"))); // NOI18N
        txtubahpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtubahpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtubahpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtubahpassMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtubahpassMousePressed(evt);
            }
        });
        add(txtubahpass);
        txtubahpass.setBounds(770, 450, 190, 30);

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye1.png"))); // NOI18N
        eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeMouseClicked(evt);
            }
        });
        add(eye);
        eye.setBounds(900, 390, 50, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/login form.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1370, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//    main apa = (main)SwingUtilities.getWindowAncestor(this);
//    apa.showkoko();
//    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
    String user = inputusername.getText();
    String pass = inputpassword.getText();
        Auth ap = new Auth();
        System.out.println(pass);
    if(ap.login(user, pass)){
        if (ap.level == 1) {
            main wow = (main)SwingUtilities.getWindowAncestor(this);
        this.setVisible(false);
        wow.showdasboardowner();
            validasiberhasil aa = new validasiberhasil(wow,"Anda Berhasil Login");
            aa.showPopUp();
        } else {
            main wow = (main)SwingUtilities.getWindowAncestor(this);
         this.setVisible(false);
            wow.showdasboard();
            validasiberhasil aa = new validasiberhasil(wow,"Anda Berhasil Login");
            aa.showPopUp();            
        }
        
    }else{
        System.out.println("gagal login");
    }
    }//GEN-LAST:event_btnloginMouseClicked

    private void txtubahpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtubahpassMouseClicked
    main wow = (main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    wow.showkode();
    }//GEN-LAST:event_txtubahpassMouseClicked

    private void eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseClicked
    if (isHidden) {
           inputpassword.setEchoChar((char) 0);
//            toggleButton.setText("Hide Password");
            eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye2.png")));
            isHidden = false;
        } else {
            inputpassword.setEchoChar('*');
            eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/eye1.png")));
//            toggleButton.setText("Show Password");
            isHidden = true;
        }
    }//GEN-LAST:event_eyeMouseClicked

    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseEntered
    btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin2.png")));
    }//GEN-LAST:event_btnloginMouseEntered

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseExited
    btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin1.png")));
    }//GEN-LAST:event_btnloginMouseExited

    private void btnloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMousePressed
    btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin3.png")));
    }//GEN-LAST:event_btnloginMousePressed

    private void txtubahpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtubahpassMouseEntered
    txtubahpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Lupa password_2.png")));
    }//GEN-LAST:event_txtubahpassMouseEntered

    private void txtubahpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtubahpassMouseExited
    txtubahpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Lupa password_1.png")));
    }//GEN-LAST:event_txtubahpassMouseExited

    private void txtubahpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtubahpassMousePressed
    txtubahpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Lupa password_3.png")));
    }//GEN-LAST:event_txtubahpassMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel eye;
    private javax.swing.JPasswordField inputpassword;
    private javax.swing.JTextField inputusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField password;
    private javax.swing.JLabel txtubahpass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
