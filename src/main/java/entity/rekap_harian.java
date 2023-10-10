
package entity;

import java.util.Date;

public class rekap_harian implements Entity{
    public static String tableName = "rekap_harian";
    private int id, id_dokter, id_master;
    private String  jam;
    private Date tanggal;
    public rekap_harian(){
        
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_master(int id_master) {
        this.id_master = id_master;
    }

    public int getId_master() {
        return id_master;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    
    
    
}
