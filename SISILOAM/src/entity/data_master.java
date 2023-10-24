
package entity;

public class data_master implements Entity{
    public static String tableName = "data_master";
    private int id, nik;
    private String no_rm, nama, alamat, ttl, jenis_kelamin;

    public data_master(){
        
    }
    
    public data_master(int id){
        this.id = id;
    }
    
    public data_master(String nama, int nik, String alamat, String ttl, String jenis_kelamin){
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.ttl = ttl;
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public data_master(String no_rm, String nama, int nik, String alamat, String ttl, String jenis_kelamin){
        this.no_rm = no_rm;
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.ttl = ttl;
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
        
    }

    public String getAlamat() {
        return alamat;
        
    }

    public void setNo_rm(String no_rm) {
        this.no_rm = no_rm;
    }

    public String getNo_rm() {
        return no_rm;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public int getNik() {
        return nik;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getTtl() {
        return ttl;
    }
    
}
