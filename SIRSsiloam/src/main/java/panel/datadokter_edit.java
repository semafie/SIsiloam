/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import entity.data_dokter;
import java.awt.Font;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import main.main;
import repository.data_dokterRepository;
import view.swing.validasiberhasil;

/**
 *
 * @author semafie
 */
public class datadokter_edit extends javax.swing.JPanel {
    data_dokterRepository dokter = new data_dokterRepository();
    datadokter apa = new datadokter();
    private String jenispoli;
    private String jeniskelamin;
    private int ids = apa.id;
    
    private String nohp;
    /**
     * Creates new form datadokter_edit
     */
    public datadokter_edit() {
        initComponents();
        tampil();
    }
    public void tampil(){
        Font font = new Font("Quicksand", Font.PLAIN, 22);
        txt_id.setFont(font);
        txt_jadwal.setFont(font);
        txt_nama.setFont(font);
        txt_nohp.setFont(font);
//        int id = master.get(ids).getId();
        String nama = dokter.get(ids).getNama();
        String no_hp = dokter.get(ids).getNo_hp();
        String jenispoli = dokter.get(ids).getJenis_poli();
        String jadwal = dokter.get(ids).getJadwal();
        String jnk = dokter.get(ids).getJenis_kelamin();
System.out.println(ids);
System.out.println(nama);
System.out.println(jenispoli);
System.out.println(jadwal);
System.out.println(jnk);
System.out.println(no_hp);
        txt_id.setText(Integer.toString(ids));
        txt_nama.setText(nama);
        txt_nohp.setText(no_hp);
        txt_jadwal.setText(jadwal);
        if (jenispoli.equals("Poli umum")) {
            cmb_poli.setSelectedIndex(0);
        } else if(jenispoli.equals("Poli gigi")) {
            cmb_poli.setSelectedIndex(1);
        } else {
            cmb_poli.setSelectedIndex(2);
        }
        if (jnk.equals("Laki - Laki")) {
            cmb_jeniskelamin.setSelectedIndex(0);
        } else {
            cmb_jeniskelamin.setSelectedIndex(1);
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

        txt_nohp = new javax.swing.JTextField();
        txt_jadwal = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        btnbatal = new javax.swing.JLabel();
        btnselanjutnya = new javax.swing.JLabel();
        cmb_poli = new view.swing.Combobox();
        cmb_jeniskelamin = new view.swing.Combobox();
        bg = new javax.swing.JLabel();

        setLayout(null);

        txt_nohp.setBackground(new Color(0,0,0,0));
        txt_nohp.setBorder(null);
        add(txt_nohp);
        txt_nohp.setBounds(530, 390, 530, 50);

        txt_jadwal.setBackground(new Color(0,0,0,0));
        txt_jadwal.setBorder(null);
        add(txt_jadwal);
        txt_jadwal.setBounds(530, 600, 530, 50);

        txt_nama.setBackground(new Color(0,0,0,0));
        txt_nama.setBorder(null);
        add(txt_nama);
        txt_nama.setBounds(530, 320, 530, 50);

        txt_id.setBackground(new Color(0,0,0,0));
        txt_id.setBorder(null);
        add(txt_id);
        txt_id.setBounds(530, 250, 530, 50);

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

        cmb_poli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Poli umum", "Poli gigi", "Poli mata" }));
        cmb_poli.setLabeText("Pilih Poli");
        cmb_poli.setLineColor(new java.awt.Color(0, 153, 153));
        add(cmb_poli);
        cmb_poli.setBounds(560, 460, 320, 50);

        cmb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki - Laki", "Perempuan" }));
        cmb_jeniskelamin.setLabeText("Pilih Kelamin");
        cmb_jeniskelamin.setLineColor(new java.awt.Color(0, 153, 153));
        cmb_jeniskelamin.setName(""); // NOI18N
        add(cmb_jeniskelamin);
        cmb_jeniskelamin.setBounds(560, 530, 320, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg edit dokter baru.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdatadokter();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btnselanjutnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseClicked
    String input = txt_id.getText();
    if (input.matches("\\d+")) {
    ids = Integer.parseInt(input);
    } else {
    JOptionPane.showMessageDialog(null, "Nomor RM harus berupa angka integer.");
    }
    String nohp2 = txt_nohp.getText();
    if (nohp2.matches("\\d+")) {
    nohp = nohp2;
    } else {
    JOptionPane.showMessageDialog(null, "Nomor hp harus berupa angka integer.");
    }
    String nama = txt_nama.getText();
    Object selectedItem = cmb_poli.getSelectedItem();
    Object selectedItem1 = cmb_jeniskelamin.getSelectedItem();
    jenispoli = selectedItem.toString();
    jeniskelamin = selectedItem1.toString();
    String jadwal = txt_jadwal.getText();
        Date hariini =new Date();
        data_dokter apa = new data_dokter(ids, nama, nohp, jenispoli, jadwal,jeniskelamin, 0, hariini);
        data_dokterRepository datadokter = new data_dokterRepository();
        datadokter.update(apa);
        main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdatadokter();
    validasiberhasil ac = new validasiberhasil(main, "Data Berhasil Di edit");
            ac.showPopUp();

    }//GEN-LAST:event_btnselanjutnyaMouseClicked

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal2_1.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal1_1.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal3_1.png")));
    }//GEN-LAST:event_btnbatalMousePressed

    private void btnselanjutnyaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseEntered
    btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya2.png")));
    }//GEN-LAST:event_btnselanjutnyaMouseEntered

    private void btnselanjutnyaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseExited
    btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png")));
    }//GEN-LAST:event_btnselanjutnyaMouseExited

    private void btnselanjutnyaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMousePressed
    btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya3.png")));
    }//GEN-LAST:event_btnselanjutnyaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnselanjutnya;
    private view.swing.Combobox cmb_jeniskelamin;
    private view.swing.Combobox cmb_poli;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jadwal;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nohp;
    // End of variables declaration//GEN-END:variables
}