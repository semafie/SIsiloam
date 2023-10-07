
package entity;

public class rekap_harian implements Entity{
    public static String tableName = "rekap_harian";
    private int id, no_rm;
    private String nama, nama_dokter, jenis_poli, jenis_kelamin, jam;
    public rekap_harian(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
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

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNo_rm(int no_rm) {
        this.no_rm = no_rm;
    }

    public int getNo_rm() {
        return no_rm;
    }
    
    
}
