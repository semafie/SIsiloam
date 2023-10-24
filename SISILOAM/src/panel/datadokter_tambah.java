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
public class datadokter_tambah extends javax.swing.JPanel {
    private String jenispoli;
    private String jeniskelamin;
    private int id;
    private String nohp;
    data_dokterRepository master = new data_dokterRepository();
    /**
     * Creates new form datadokter_tambah
     */
    public datadokter_tambah() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 22);
        txt_nama.setFont(font);
        txt_jadwal.setFont(font);
        txt_no_rm.setFont(font);
        txt_nohp.setFont(font);
        int id = master.getlastid().getId() + 1 ;
        String idterakhir = String.valueOf(id);
        txt_no_rm.setText(idterakhir );
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
        txt_no_rm = new javax.swing.JTextField();
        btnkembali = new javax.swing.JLabel();
        btnselanjutnya = new javax.swing.JLabel();
        cmb_poli = new view.swing.Combobox();
        cmb_jeniskelamin = new view.swing.Combobox();
        bg = new javax.swing.JLabel();

        setLayout(null);

        txt_nohp.setBackground(new Color(0,0,0,0));
        txt_nohp.setText("0");
        txt_nohp.setBorder(null);
        add(txt_nohp);
        txt_nohp.setBounds(530, 390, 500, 40);

        txt_jadwal.setBackground(new Color(0,0,0,0));
        txt_jadwal.setBorder(null);
        add(txt_jadwal);
        txt_jadwal.setBounds(530, 600, 500, 40);

        txt_nama.setBackground(new Color(0,0,0,0));
        txt_nama.setBorder(null);
        add(txt_nama);
        txt_nama.setBounds(530, 320, 500, 40);

        txt_no_rm.setBackground(new Color(0,0,0,0));
        txt_no_rm.setBorder(null);
        add(txt_no_rm);
        txt_no_rm.setBounds(531, 250, 500, 40);

        btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali1.png"))); // NOI18N
        btnkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkembaliMouseClicked(evt);
            }
        });
        add(btnkembali);
        btnkembali.setBounds(10, 701, 190, 60);

        btnselanjutnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnselanjutnya1.png"))); // NOI18N
        btnselanjutnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnselanjutnyaMouseClicked(evt);
            }
        });
        add(btnselanjutnya);
        btnselanjutnya.setBounds(1110, 701, 250, 60);

        cmb_poli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Poli umum", "Poli gigi", "Poli mata" }));
        cmb_poli.setLabeText("Pilih Poli");
        cmb_poli.setLineColor(new java.awt.Color(0, 153, 153));
        add(cmb_poli);
        cmb_poli.setBounds(560, 460, 320, 40);

        cmb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki - Laki", "Perempuan" }));
        cmb_jeniskelamin.setLabeText("Pilih Kelamin");
        cmb_jeniskelamin.setLineColor(new java.awt.Color(0, 153, 153));
        cmb_jeniskelamin.setName(""); // NOI18N
        add(cmb_jeniskelamin);
        cmb_jeniskelamin.setBounds(560, 530, 320, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg tambah dokter baru.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseClicked
     main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdatadokter();
    }//GEN-LAST:event_btnkembaliMouseClicked

    private void btnselanjutnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnselanjutnyaMouseClicked
//    int id = Integer.valueOf(txt_no_rm.getText());
    String input = txt_no_rm.getText();
//    if (input.matches("\\d+")) {
//    id = Integer.parseInt(input);
//    } else {
//    JOptionPane.showMessageDialog(null, "Nomor RM harus berupa angka integer.");
//    }
    String nohp2 = txt_nohp.getText();
    String originalText = nohp2;
if (originalText.length() > 1) {
    String textWithoutFirstCharacter = originalText.substring(1);
    System.out.println(textWithoutFirstCharacter);

    if (textWithoutFirstCharacter.matches("\\d+")) {
    nohp = "0"+nohp2;
    } else {
    JOptionPane.showMessageDialog(null, "Nomor hp harus berupa angka integer.");
    }
    } else {
    System.out.println("Teks terlalu pendek untuk dihapus karakter pertama.");
}
    String nama = txt_nama.getText();
    Object selectedItem = cmb_poli.getSelectedItem();
    Object selectedItem1 = cmb_jeniskelamin.getSelectedItem();
    jenispoli = selectedItem.toString();
    jeniskelamin = selectedItem1.toString();
    String jadwal = txt_jadwal.getText();
        Date hariini =new Date();
    data_dokter apa = new data_dokter( nama, nohp, jenispoli, jadwal,jeniskelamin, 0, hariini);
    data_dokterRepository datadokter = new data_dokterRepository();
    datadokter.add(apa);
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdatadokter();
    validasiberhasil ac = new validasiberhasil(main, "Data Berhasil Ditambahkan");
            ac.showPopUp();

    }//GEN-LAST:event_btnselanjutnyaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnkembali;
    private javax.swing.JLabel btnselanjutnya;
    private view.swing.Combobox cmb_jeniskelamin;
    private view.swing.Combobox cmb_poli;
    private javax.swing.JTextField txt_jadwal;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no_rm;
    private javax.swing.JTextField txt_nohp;
    // End of variables declaration//GEN-END:variables
}