/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import entity.pasienbaru_sementara;
import java.awt.Font;
import javax.swing.SwingUtilities;
import main.main;
import repository.data_masterRepository;

import repository.datapasienbarusementara;
import repository.pasienbaru_sementaraRepository;

/**
 *
 * @author semafie
 */
public class pasienbaru1 extends javax.swing.JPanel {
    data_masterRepository master = new data_masterRepository();
    class AutoIDGenerator {
    int left = 0;
    int middle = 0;
    int right = 0;

    public String generateAutoID() {
        if (right < 99) {
            right++;
        } else {
            right = 0;
            if (middle < 99) {
                middle++;
            } else {
                middle = 0;
                if (left < 99) {
                    left++;
                } else {
                    // Reset ke 0 jika semua sudah mencapai 99
                    left = 0;
                }
            }
        }

        String leftStr = String.format("%02d", left);
        String middleStr = String.format("%02d", middle);
        String rightStr = String.format("%02d", right);

        return rightStr+ "-" + middleStr + "-" + leftStr ;
    }
    }
    pasienbaru_sementaraRepository bb = new pasienbaru_sementaraRepository();
    public pasienbaru1() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 22);
        txt_alamat.setFont(font);
        txt_nama_pasien.setFont(font);
        txt_nik.setFont(font);
        txt_no_rm.setFont(font);
        txt_ttl.setFont(font);
        AutoIDGenerator generator = new AutoIDGenerator();
        String idterakhir = String.valueOf(master.getlastid().getNo_rm());
        String apa = "99-20-30";
        String[] parts = idterakhir.split("-");



        if(!idterakhir.equals( "null")){
        generator.left = Integer.parseInt(parts[2]);
        generator.middle = Integer.parseInt(parts[1]);
        generator.right = Integer.parseInt(parts[0]);
        String autoID = generator.generateAutoID();
        txt_no_rm.setText(autoID);
System.out.println(idterakhir);
        } else {
            txt_no_rm.setText("01-00-00");
        }
        
        
        txt_nama_pasien.setText(bb.get(1).getNama());
        txt_alamat.setText(bb.get(1).getAlamat());
        txt_nik.setText(String.valueOf(bb.get(1).getNik()));
        txt_ttl.setText(bb.get(1).getTtl());
        if (bb.get(1).getJenis_kelamin().equals("Laki - Laki")) {
            cmd_jnk.setSelectedIndex(0);
        } else {
            cmd_jnk.setSelectedIndex(1);
        }
//        Object selectedItem = cmd_jnk.getSelectedItem();   
//        String jnk = selectedItem.toString();
//        System.out.println(jnk);
        
    }
    
    public void apek(){

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_kembali = new javax.swing.JLabel();
        btn_lanjut = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_ttl = new javax.swing.JTextField();
        txt_nama_pasien = new javax.swing.JTextField();
        txt_no_rm = new javax.swing.JTextField();
        cmd_jnk = new view.swing.Combobox();
        bg = new javax.swing.JLabel();
        cacacac = new javax.swing.JTextField();

        setLayout(null);

        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal1_1.png"))); // NOI18N
        btn_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_kembaliMousePressed(evt);
            }
        });
        add(btn_kembali);
        btn_kembali.setBounds(10, 701, 160, 60);

        btn_lanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png"))); // NOI18N
        btn_lanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_lanjutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lanjutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lanjutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_lanjutMousePressed(evt);
            }
        });
        add(btn_lanjut);
        btn_lanjut.setBounds(1110, 701, 250, 60);

        txt_nik.setBackground(new Color(0,0,0,0));
        txt_nik.setBorder(null);
        add(txt_nik);
        txt_nik.setBounds(550, 390, 490, 40);

        txt_alamat.setBackground(new Color(0,0,0,0));
        txt_alamat.setBorder(null);
        add(txt_alamat);
        txt_alamat.setBounds(550, 460, 490, 40);

        txt_ttl.setBackground(new Color(0,0,0,0));
        txt_ttl.setBorder(null);
        add(txt_ttl);
        txt_ttl.setBounds(550, 530, 490, 40);

        txt_nama_pasien.setBackground(new Color(0,0,0,0));
        txt_nama_pasien.setBorder(null);
        add(txt_nama_pasien);
        txt_nama_pasien.setBounds(550, 320, 490, 40);

        txt_no_rm.setBackground(new Color(0,0,0,0));
        txt_no_rm.setBorder(null);
        add(txt_no_rm);
        txt_no_rm.setBounds(550, 250, 490, 40);

        cmd_jnk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki - Laki", "Perempuan" }));
        cmd_jnk.setLabeText("Pilih Kelamin");
        cmd_jnk.setLineColor(new java.awt.Color(0, 153, 153));
        cmd_jnk.setName(""); // NOI18N
        add(cmd_jnk);
        cmd_jnk.setBounds(570, 600, 280, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/Pasien Baru.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);

        cacacac.setText("jTextField1");
        add(cacacac);
        cacacac.setBounds(310, 180, 71, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdasboard();
    }//GEN-LAST:event_btn_kembaliMouseClicked

    private void btn_lanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lanjutMouseClicked
//int no = Integer.valueOf(txt_no_rm.getText());
        String nama = txt_nama_pasien.getText();
        int nik = Integer.valueOf(txt_nik.getText());
        String ttl = txt_ttl.getText();
        String alamat = txt_alamat.getText();
        Object selectedItem = cmd_jnk.getSelectedItem();   
        String jnk = selectedItem.toString();
        System.out.println(jnk);
        pasienbaru_sementara aa = new pasienbaru_sementara(1, nama, nik, alamat, ttl, jnk);
        bb.update(aa);
//        if (txt_no_rm.getText().equals("") || txt_nik.getText().equals("") || txt_alamat.getText().equals("") || txt_nama_pasien.getText().equals("") || txt_ttl.getText().equals("")) {
//            System.out.println("isi data sek muas");
//        } else {
//            
//        }
        main main =(main)SwingUtilities.getWindowAncestor(this);
        this.setVisible(false);
        main.showpasienbaru_pilihpoli();
    }//GEN-LAST:event_btn_lanjutMouseClicked

    private void btn_kembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseEntered
    btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal2_1.png")));
    }//GEN-LAST:event_btn_kembaliMouseEntered

    private void btn_kembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseExited
    btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal1_1.png")));
    }//GEN-LAST:event_btn_kembaliMouseExited

    private void btn_kembaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMousePressed
    btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal3_1.png")));
    }//GEN-LAST:event_btn_kembaliMousePressed

    private void btn_lanjutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lanjutMouseEntered
    btn_lanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya2.png")));
    }//GEN-LAST:event_btn_lanjutMouseEntered

    private void btn_lanjutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lanjutMouseExited
    btn_lanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png")));
    }//GEN-LAST:event_btn_lanjutMouseExited

    private void btn_lanjutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lanjutMousePressed
    btn_lanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya3.png")));
    }//GEN-LAST:event_btn_lanjutMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btn_kembali;
    private javax.swing.JLabel btn_lanjut;
    private javax.swing.JTextField cacacac;
    private view.swing.Combobox cmd_jnk;
    public static javax.swing.JTextField txt_alamat;
    public static javax.swing.JTextField txt_nama_pasien;
    public static javax.swing.JTextField txt_nik;
    public static javax.swing.JTextField txt_no_rm;
    public static javax.swing.JTextField txt_ttl;
    // End of variables declaration//GEN-END:variables
}
