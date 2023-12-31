/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import main.main;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
//import main.main;
import repository.userRepository;
import service.Auth;
import util.Conn;
import view.swing.validasiberhasil;
import view.swing.validasigagal;
import view.swing.validasikonfirmasi;



public class Login extends javax.swing.JPanel {
    userRepository ret = new userRepository();
    private static boolean isHidden = true;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
//        JRootPane rootPane = SwingUtilities.getRootPane(btnlogin);
//        rootPane.setDefaultButton(btnlogin);
btnlogin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Tindakan yang akan dijalankan ketika tombol "Enter" ditekan pada JLabel
                    System.out.println("Tombol Enter ditekan pada JLabel");
                    btnloginMouseClicked(null);
                }
            }
        });

        Font font = new Font("Quicksand", Font.PLAIN, 18);
        setHintText(inputpassword, "Input Password");
        inputusername.setFont(font);
        inputpassword.setFont(font);
        inputusername.setForeground(Color.GRAY);
        
    }
    public void ganti(){
        this.setVisible(false);
    }
    public static void setHintText(JPasswordField passwordField, String hintText) {
        passwordField.setText(hintText);
        passwordField.setEchoChar((char) 0);
        passwordField.setForeground(Color.GRAY);// Set echo character to '*'
        
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals(hintText)) {
                    passwordField.setEchoChar('*'); // Show '*' for hint text
                    passwordField.setText("");
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("")) {
                    passwordField.setEchoChar((char) 0); // Show actual characters for input
                    passwordField.setText(hintText);
                    passwordField.setForeground(Color.GRAY);
                    
                }
            }
        });
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
        btnlogout = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

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
        inputpassword.setText("Input Password");
        inputpassword.setBorder(null);
        inputpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputpasswordActionPerformed(evt);
            }
        });
        add(inputpassword);
        inputpassword.setBounds(490, 390, 390, 40);

        inputusername.setBackground(new Color(0,0,0,0));
        inputusername.setText("Input Username");
        inputusername.setBorder(null);
        inputusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputusernameFocusLost(evt);
            }
        });
        inputusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputusernameMouseClicked(evt);
            }
        });
        inputusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputusernameActionPerformed(evt);
            }
        });
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

        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogout1.png"))); // NOI18N
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlogoutMousePressed(evt);
            }
        });
        add(btnlogout);
        btnlogout.setBounds(20, 700, 180, 51);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/login form.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1370, 770);

        jTextField1.setText("jTextField1");
        add(jTextField1);
        jTextField1.setBounds(390, 260, 71, 22);
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
        System.out.println(user);
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
        main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Usename atau password salah");
            aa.showPopUp(); 
        
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

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        main main =(main)SwingUtilities.getWindowAncestor(this);
        main.dispose();
    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btnlogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseEntered
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogout2.png")));
    }//GEN-LAST:event_btnlogoutMouseEntered

    private void btnlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseExited
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogout1.png")));
    }//GEN-LAST:event_btnlogoutMouseExited

    private void btnlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMousePressed
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogout3.png")));
    }//GEN-LAST:event_btnlogoutMousePressed

    private void inputusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputusernameFocusGained
    if (inputusername.getText().equals("Input Username")) {
                    inputusername.setText("");
                    inputusername.setForeground(Color.BLACK);
                }
    }//GEN-LAST:event_inputusernameFocusGained

    private void inputusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputusernameFocusLost
    if (inputusername.getText().isEmpty()) {
                    inputusername.setText("Input Username");
                    inputusername.setForeground(Color.GRAY);
                }
    }//GEN-LAST:event_inputusernameFocusLost

    private void inputpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputpasswordActionPerformed
        
    }//GEN-LAST:event_inputpasswordActionPerformed

    private void inputusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputusernameActionPerformed
        
    }//GEN-LAST:event_inputusernameActionPerformed

    private void inputusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputusernameMouseClicked
        
    }//GEN-LAST:event_inputusernameMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel btnlogout;
    private javax.swing.JLabel eye;
    private javax.swing.JPasswordField inputpassword;
    private javax.swing.JTextField inputusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField password;
    private javax.swing.JLabel txtubahpass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
