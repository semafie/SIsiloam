/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import entity.data_dokter;
import entity.data_master;
import entity.rekap_harian;
import java.awt.Font;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
import repository.data_dokterRepository;
import repository.data_masterRepository;
import repository.datapasienbarusementara;
import repository.pasienbaru_sementaraRepository;
import repository.rekap_harianRepository;
import util.Conn;
import view.swing.itemdokter_tampilann;
import view.swing.itempoli_tampilan;
import view.swing.validasiberhasil;

/**
 *
 * @author Be Mine
 */
public class pasienbaru_tambahdaftar1 extends javax.swing.JPanel {
    pasienbaru a = new pasienbaru();
    data_dokterRepository b = new data_dokterRepository();
    itemdokter_tampilann c = new itemdokter_tampilann();
    data_masterRepository master = new data_masterRepository();
    itempoli_tampilan poli = new itempoli_tampilan();
    pasienbaru_sementaraRepository apa = new pasienbaru_sementaraRepository();
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    rekap_harianRepository gas = new rekap_harianRepository();
    pasienlama ab =new pasienlama();
    private int idf= ab.id;
    private int lastid;
    private String ambilpoli = poli.jeje;
    private String autoID;
    private String nik;
    private int idd;
    private int idfinalrekap;
    /**
     * Creates new form tambahdaftar
     */
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
    public pasienbaru_tambahdaftar1() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 22);
        txt_id.setFont(font);
        txt_nama.setFont(font);
        txt_dokter1.setFont(font);
        tanggal.setFont(font);
        AutoIDGenerator generator = new AutoIDGenerator();
        String idterakhir = String.valueOf(master.getlastid().getNo_rm());
//        String apa11 = "99-20-30";
       
        txt_id.setText(idterakhir);
        
        idd = c.id;
        

        String waktusekarang = dateFormat.format(date);
        
        
//        txt_id.setText(String.valueOf(apa.get(1).get));
        txt_nama.setText(master.get(idf).getNama());
        txt_alamat.setText(master.get(idf).getAlamat());
        txt_nik.setText(String.valueOf(master.get(idf).getNik()));
        nik = String.valueOf(master.get(idf).getNik());
        txt_ttl.setText(master.get(idf).getTtl());
        txt_jnk.setText(master.get(idf).getJenis_kelamin());
        txt_jam.setText(waktusekarang);
        txt_dokter1.setText(b.get(idd).getNama());
        Date tanggalHariIni = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tanggalString = sdf.format(tanggalHariIni);
        tanggal.setText(tanggalString);
        if (ambilpoli.equals("Poli umum")) {
            cmb_poli.setSelectedIndex(0);
        } else if(ambilpoli.equals("Poli gigi")) {
            cmb_poli.setSelectedIndex(1);
        } else {
            cmb_poli.setSelectedIndex(2);
        }
        txt_jenispoli.setText(ambilpoli);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsimpandancetaknoantrian = new javax.swing.JLabel();
        btnbatal = new javax.swing.JLabel();
        btnkembali = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        txt_nama = new javax.swing.JLabel();
        txt_jam = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        txt_dokter1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_jenispoli = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        cmb_poli = new javax.swing.JComboBox<>();
        txt_nik = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JLabel();
        txt_ttl = new javax.swing.JLabel();
        txt_jnk = new javax.swing.JLabel();

        setLayout(null);

        btnsimpandancetaknoantrian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpandancetaknoantrian1.png"))); // NOI18N
        btnsimpandancetaknoantrian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpandancetaknoantrianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpandancetaknoantrianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpandancetaknoantrianMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpandancetaknoantrianMousePressed(evt);
            }
        });
        add(btnsimpandancetaknoantrian);
        btnsimpandancetaknoantrian.setBounds(780, 700, 544, 50);

        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal3.png"))); // NOI18N
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
        btnbatal.setBounds(520, 700, 260, 50);

        btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali1.png"))); // NOI18N
        btnkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkembaliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkembaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkembaliMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnkembaliMousePressed(evt);
            }
        });
        add(btnkembali);
        btnkembali.setBounds(10, 700, 200, 60);
        add(tanggal);
        tanggal.setBounds(1080, 50, 170, 30);
        add(txt_nama);
        txt_nama.setBounds(540, 330, 520, 50);
        add(txt_jam);
        txt_jam.setBounds(570, 570, 490, 50);
        add(txt_id);
        txt_id.setBounds(540, 250, 520, 50);
        add(txt_dokter1);
        txt_dokter1.setBounds(540, 410, 520, 50);
        add(jLabel4);
        jLabel4.setBounds(540, 250, 520, 50);
        add(txt_jenispoli);
        txt_jenispoli.setBounds(570, 490, 210, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg tambah daftar_1.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);

        cmb_poli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poli umum", "Poli gigi", "Poli mata" }));
        add(cmb_poli);
        cmb_poli.setBounds(570, 490, 290, 50);
        add(txt_nik);
        txt_nik.setBounds(150, 360, 0, 0);
        add(txt_alamat);
        txt_alamat.setBounds(150, 360, 0, 0);
        add(txt_ttl);
        txt_ttl.setBounds(150, 360, 0, 0);
        add(txt_jnk);
        txt_jnk.setBounds(150, 360, 0, 0);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showpasienbaru_pilihdokter();
    }//GEN-LAST:event_btnkembaliMouseClicked

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdasboard();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btnsimpandancetaknoantrianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpandancetaknoantrianMouseClicked
//    data_master keren = new data_master(txt_id.getText(),master.get(idf).getNama(),master.get(idf).getNik(),master.get(idf).getAlamat(),master.get(idf).getTtl(),master.get(idf).getJenis_kelamin());
//    master.add(keren);
    lastid = master.getlastid().getId();
    data_master masuk2 = new data_master(lastid);
    
    
        data_dokter masuk1 = new data_dokter(idd);
    
    Time waktu = new Time(System.currentTimeMillis());
    Timestamp timestamp = new Timestamp(new Date().getTime());
   
    rekap_harian keren23 = new rekap_harian(timestamp , date ,masuk1 ,masuk2);
    gas.add(keren23);
    
    int no_antrian = b.get(idd).getNo_antrian() + 1;
    Date tglhariini = new Date();
    data_dokter masuknoantrian = new data_dokter(idd,tglhariini,no_antrian);
    data_dokter masuknoantrian1 = new data_dokter(idd,tglhariini,1);
    Date tgldokter = b.get(idd).getTanggal();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tanggalString = sdf.format(tglhariini);
        String tangal = sdf.format(tgldokter);
    if(tangal.equals(tanggalString)){
      b.updateno_antriantanggal(masuknoantrian);  
    }else {
      b.updateno_antriantanggal(masuknoantrian1);  
    }
    idfinalrekap = gas.getlastid().getId();

        System.out.println(idfinalrekap);
            InputStream struk = getClass().getResourceAsStream("/jasper_report/no_antrian1.jrxml");
            String query = "SELECT * FROM rekap_harian join data_dokter on rekap_harian.id_dokter = data_dokter.id join data_master on rekap_harian.id_master = data_master.id WHERE rekap_harian.id = "+idfinalrekap;
//        String path = "E:/SEMUA FOLDER/imam/kuliah/semester 3/joki/SIsiloam/SIsiloam/SISILOAM/src/jasper_report/no_antrian.jrxml";

        try {
               Connection koneksi = (Connection) Conn.configDB();
            Statement pstCek = koneksi.createStatement();
            ResultSet res = pstCek.executeQuery(query);
            JasperDesign design = JRXmlLoader.load(struk);
            JasperReport jr = JasperCompileManager.compileReport(design);
            JRResultSetDataSource rsDataSource = new JRResultSetDataSource(res);
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);

            JasperViewer viewer = new JasperViewer(jp, false); // argumen 'false' mencegah aplikasi keluar
            viewer.setVisible(true);
            main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdasboard();
    validasiberhasil ac = new validasiberhasil(main, "Data Berhasil Ditambahkan");
            ac.showPopUp();
        } catch(Exception e) { 
            System.out.println(e.getMessage());
            e.printStackTrace(); }
    

    }//GEN-LAST:event_btnsimpandancetaknoantrianMouseClicked

    private void btnkembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseEntered
    btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali2.png")));
    }//GEN-LAST:event_btnkembaliMouseEntered

    private void btnkembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseExited
    btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali1.png")));
    }//GEN-LAST:event_btnkembaliMouseExited

    private void btnkembaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMousePressed
    btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali3.png")));
    }//GEN-LAST:event_btnkembaliMousePressed

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal2.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal3.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnbatal1.png")));
    }//GEN-LAST:event_btnbatalMousePressed

    private void btnsimpandancetaknoantrianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpandancetaknoantrianMouseEntered
    btnsimpandancetaknoantrian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpandancetaknoantrian2.png")));
    }//GEN-LAST:event_btnsimpandancetaknoantrianMouseEntered

    private void btnsimpandancetaknoantrianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpandancetaknoantrianMouseExited
    btnsimpandancetaknoantrian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpandancetaknoantrian1.png")));
    }//GEN-LAST:event_btnsimpandancetaknoantrianMouseExited

    private void btnsimpandancetaknoantrianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpandancetaknoantrianMousePressed
    btnsimpandancetaknoantrian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpandancetaknoantrian3.png")));
    }//GEN-LAST:event_btnsimpandancetaknoantrianMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnkembali;
    private javax.swing.JLabel btnsimpandancetaknoantrian;
    private javax.swing.JComboBox<String> cmb_poli;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel tanggal;
    private javax.swing.JLabel txt_alamat;
    private javax.swing.JLabel txt_dokter1;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_jam;
    private javax.swing.JLabel txt_jenispoli;
    private javax.swing.JLabel txt_jnk;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JLabel txt_nik;
    private javax.swing.JLabel txt_ttl;
    // End of variables declaration//GEN-END:variables
}
