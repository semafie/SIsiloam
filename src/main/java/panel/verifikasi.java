/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.mail.Message;
import javax.mail.MessagingException;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;

import javax.swing.SwingUtilities;
import main.main;
import service.Auth;
import util.Conn;
/**
 *
 * @author RESCOM-1
 */
public class verifikasi extends javax.swing.JPanel {

    /**
     * Creates new form verifikasi
     */
    private static int timeRemaining; // 2 menit dalam detik
    private static Timer timer;
    Auth a = new Auth();
    private String username = a.username;
//    public String username(){
//    username = a.username;
//    return username;
//    } 
    
//    public  String getaaa(){
//        return username;
//    }
    private String email;
        class poo{
    private String text;
//    private String email;
    public poo() {
        this.text = generateText();
    }

    private String generateText() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
    

    public String getText() {
        return this.text;
    }
}
private String apa1;
    public String randomNumber(){
    poo apa =new poo();
    String randomNumbera = apa.getText();
    apa1 = apa.getText();
//        System.out.println(randomNumbera);
    return randomNumbera;
}
    public String getapa(){
        return apa1;
        
    }
    public verifikasi() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 30);
        txt.setVisible(false);
        resendcode1.setVisible(true);
        resendcode.setVisible(false);
        if (timer != null) {
            timer.cancel();
        }
        timeRemaining = 120;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (timeRemaining > 0) {
                    labelhitung.setText("Tunggu " + timeRemaining + " detik");
                    timeRemaining--;
                    
                } else {
                    resendcode1.setVisible(false);
                    resendcode.setVisible(true);
                    timer.cancel();
                    labelhitung.setText("Waktu Habis");
                }
            }
        }, 0, 1000);
        
    }
    
    
    public void kirim()throws AddressException, MessagingException {
           String host = "smtp.gmail.com";
    int port = 587;
    String username = "travelrahmatan@gmail.com";
    String password = "adifmmdndqeehmwq";
    
    Properties props = new Properties();
    props.put("mail.smtp.auth","true");
    props.put("mail.smtp.starttls.enable","true");
    props.put("mail.smtp.host",host);
    props.put("mail.smtp.port",port);
    
    Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, password);
            }
            });
    String from    = "travelrahmatan@gmail.com";
    String to      = email ;
    String subject = "Kode Verifikasi Ganti Password Rahmatan App";
    String body = randomNumber();

        Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress(from));
    message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(to));
    message.setSubject(subject);
//    message.setText(body);
    String html = "<html>\n" +
"<div style=\"background:#f9f9f9;background-color:#f9f9f9;Margin:0px auto;max-width:600px;\">\n" +
"    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"background:#f9f9f9;background-color:#f9f9f9;width:100%;\">\n" +
"        <tbody>\n" +
"            <tr>\n" +
"                <td style=\"border-bottom:#333957 solid 5px;direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;\"></td>\n" +
"            </tr>\n" +
"        </tbody>\n" +
"    </table>\n" +
"</div>\n" +
"\n" +
"<div style=\"background:#fff;background-color:#fff;Margin:0px auto;max-width:600px;\">\n" +
"    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"background:#fff;background-color:#fff;width:100%;\">\n" +
"        <tbody>\n" +
"            <tr>\n" +
"                <td style=\"border:#dddddd solid 1px;border-top:0px;direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;\">\n" +
"                    <div class=\"mj-column-per-100 outlook-group-fix\" style=\"font-size:13px;text-align:left;direction:ltr;display:inline-block;vertical-align:bottom;width:100%;\">\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"vertical-align:bottom;\" width=\"100%\">\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;word-break:break-word;\">\n" +
"                                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"border-collapse:collapse;border-spacing:0px;\">\n" +
"                                        <tbody>\n" +
"                                            <tr>\n" +
"                                                <td style=\"width:64px;\">\n" +
"                                                    <!-- <img height=\"auto\" src=\"https://i.imgur.com/KO1vcE9.png\" style=\"border:0;display:block;outline:none;text-decoration:none;width:100%;\" width=\"64\" /> -->\n" +
"                                                </td>\n" +
"                                            </tr>\n" +
"                                        </tbody>\n" +
"                                    </table>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;padding-bottom:40px;word-break:break-word;\">\n" +
"                                    <div style=\"font-family:'Helvetica Neue',Arial,sans-serif;font-size:32px;font-weight:bold;line-height:1;text-align:center;color:#555;\">Kode Verifikasi</div>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;padding-bottom:20px;word-break:break-word;\">\n" +
"                                    <div style=\"font-family:'Helvetica Neue',Arial,sans-serif;font-size:16px;line-height:22px;text-align:center;color:#555;\">Gunakan kode di bawah untuk mereset password anda</div>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;padding-top:30px;padding-bottom:40px;word-break:break-word;\">\n" +
"                                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"border-collapse:separate;line-height:100%;\">\n" +
"                                        <tr>\n" +
"                                            <td align=\"center\" bgcolor=\"#2F67F6\" role=\"presentation\" style=\"border:none;border-radius:3px;color:#ffffff;cursor:auto;padding:10px 20px;\" valign=\"middle\">\n" +
"                                                <p style=\"background:#2F67F6;color:#ffffff;font-family:'Helvetica Neue',Arial,sans-serif;font-size:30px;letter-spacing:4px;font-weight:bold;line-height:120%;Margin:0;text-decoration:none;text-transform:none;\" id=\"code\">"+body+"</p>\n" +
"                                            </td>\n" +
"                                        </tr>\n" +
"                                    </table>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;word-break:break-word;\">\n" +
"                                    <div style=\"font-family:'Helvetica Neue',Arial,sans-serif;font-size:14px;line-height:22px;text-align:center;color:#555;\">Rahmatan Transaction System<br> <a href=\"mailto:info@example.com\" style=\"color:#2F67F6\">travelrahmatan@gmail.com</a>\n" +
"                                    </div>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                        </table>\n" +
"                    </div>\n" +
"                </td>\n" +
"            </tr>\n" +
"        </tbody>\n" +
"    </table>\n" +
"</div>" +
"</html>";
    message.setContent(html, "text/html");
    Transport.send(message);
    }
    public static void startCountdown() {
         // Timer task akan dijalankan setiap 1 detik
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnverif = new javax.swing.JLabel();
        inputverifikasi = new javax.swing.JTextField();
        labelhitung = new javax.swing.JLabel();
        resendcode1 = new javax.swing.JLabel();
        resendcode = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(null);

        btnverif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnverifikasi1.png"))); // NOI18N
        btnverif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnverifMouseClicked(evt);
            }
        });
        add(btnverif);
        btnverif.setBounds(470, 530, 426, 80);

        inputverifikasi.setBackground(new Color(0,0,0,0));
        inputverifikasi.setBorder(null);
        add(inputverifikasi);
        inputverifikasi.setBounds(490, 360, 390, 50);

        labelhitung.setForeground(new java.awt.Color(255, 67, 67));
        add(labelhitung);
        labelhitung.setBounds(475, 470, 220, 20);

        resendcode1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Resend Code-1.png"))); // NOI18N
        resendcode1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resendcode1MouseClicked(evt);
            }
        });
        add(resendcode1);
        resendcode1.setBounds(475, 450, 110, 14);

        resendcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Resend Code-1.png"))); // NOI18N
        resendcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resendcodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resendcodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resendcodeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resendcodeMousePressed(evt);
            }
        });
        add(resendcode);
        resendcode.setBounds(475, 450, 110, 14);

        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/tulis kode dengan benar.png"))); // NOI18N
        add(txt);
        txt.setBounds(745, 450, 150, 13);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/verifikasi kode.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnverifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverifMouseClicked
    
        String token = inputverifikasi.getText();
        
         String queryCek = "SELECT token FROM user WHERE username = ?";
         
        try {
        Connection koneksi = (Connection) Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(queryCek);
        pst.setString(1, username);
        ResultSet res = pst.executeQuery();
        if(res.next()){
            if(inputverifikasi.getText().equals(res.getString("token"))){
             
                a.hapusToken(username);
//                a.username = "";
                buatpasswordbaru apa = new buatpasswordbaru();
                this.setVisible(false);
                main main1 =(main)SwingUtilities.getWindowAncestor(this); 
                main1.showpass();
                
            }else{
               txt.setVisible(true);
            }
        }
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_btnverifMouseClicked

    private void resendcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resendcodeMouseClicked
    Auth wew = new Auth();
        String sql = "SELECT * FROM user WHERE username = ?";
        try {
                        Connection koneksi = (Connection)Conn.configDB();
                                PreparedStatement pst = koneksi.prepareStatement(sql);
                                pst.setString(1, username);
                                ResultSet res = pst.executeQuery();
                                if (res.next()) {
                                email = res.getString("email");
                                System.out.println(email);
                                kirim();
                                ;
                                System.out.println(username);
                                String token = getapa();
                                wew.kirimTokenDB(username, token);
                                System.out.println(token);
                                    try {
//                                        verifikasi apa = new verifikasi();
//                                 this.setVisible(false);
//                                 apa.setVisible(true);
                                
//                                dialog_mintakode a = new dialog_mintakode(main);
//                                a.showPopUp();
                               
                               
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                 
//                               jPanel1.setVisible(false);
//                               jPanel2.setVisible(true);
                            }
                    } catch (Exception e) {
                        System.out.println(e.getMessage().toString());
                        System.out.println("gagall");
                    }
        resendcode1.setVisible(true);
        resendcode.setVisible(false);
        
        timeRemaining = 120;
        if (timer != null) {
            timer.cancel();
        }
        
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (timeRemaining > 0) {
                    
                    labelhitung.setText("Tunggu " + timeRemaining + " detik");
                    timeRemaining--;
                    
                } else {
                    resendcode1.setVisible(false);
                    resendcode.setVisible(true);
                    timer.cancel();
                    labelhitung.setText("Waktu Habis");
                }
            }
        }, 0, 1000);
    }//GEN-LAST:event_resendcodeMouseClicked

    private void resendcode1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resendcode1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_resendcode1MouseClicked

    private void resendcodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resendcodeMouseEntered
        resendcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Resend Code-2.png")));
    }//GEN-LAST:event_resendcodeMouseEntered

    private void resendcodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resendcodeMouseExited
    resendcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Resend Code-1.png")));
    }//GEN-LAST:event_resendcodeMouseExited

    private void resendcodeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resendcodeMousePressed
    resendcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/Resend Code-3.png")));
    }//GEN-LAST:event_resendcodeMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnverif;
    private javax.swing.JTextField inputverifikasi;
    private javax.swing.JLabel labelhitung;
    private javax.swing.JLabel resendcode;
    private javax.swing.JLabel resendcode1;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
