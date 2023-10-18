
package entity;

import java.util.Date;

public class data_dokter implements Entity{
    public static String tableName = "data_dokter";
    private int id, no_antrian;
    private String  no_hp,nama, jenis_poli, jadwal, jenis_kelamin;
    private Date tanggal;
    
    public data_dokter(String nama, String no_hp, String jenis_poli, String jadwal, String jenis_kelamin, int no_antrian, Date tanggal){
        this.nama = nama;
        this.no_hp = no_hp;
        this.jenis_poli = jenis_poli;
        this.jadwal = jadwal;
        this.jenis_kelamin = jenis_kelamin;
        this.no_antrian = no_antrian;
        this.tanggal = tanggal;
    }
    
    public data_dokter(int id, String nama, String no_hp, String jenis_poli, String jadwal,String jenis_kelamin, int no_antrian, Date tanggal){
        this.id = id;
        this.nama = nama;
        this.no_hp = no_hp;
        this.jenis_poli = jenis_poli;
        this.jadwal = jadwal;
        this.jenis_kelamin = jenis_kelamin;
        this.no_antrian = no_antrian;
        this.tanggal = tanggal;
    }
    
    public data_dokter(){
        
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJenis_poli(String jenis_poli) {
        this.jenis_poli = jenis_poli;
    }

    public String getJenis_poli() {
        return jenis_poli;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNo_antrian(int no_antrian) {
        this.no_antrian = no_antrian;
    }

    public int getNo_antrian() {
        return no_antrian;
    }

    public void setNo_hp(String  no_hp) {
        this.no_hp = no_hp;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }
    
    
    
}
