
package entity;

public class pasienbaru_sementara implements Entity{
    public static String tableName = "pasienbaru_sementara";
    private int id;
    
    private String nama, alamat, ttl, jenis_kelamin, nik, status_pembayaran;

    public pasienbaru_sementara(){
        
    }
    
    public pasienbaru_sementara(String nama, String nik, String alamat, String ttl, String jenis_kelamin, String status_pembayaran){
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.ttl = ttl;
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public pasienbaru_sementara(int id,String nama, String nik, String alamat, String ttl, String jenis_kelamin, String status_pembayaran){
        this.id = id;
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.ttl = ttl;
        this.jenis_kelamin = jenis_kelamin;
    }

    public void setStatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }

    public String getStatus_pembayaran() {
        return status_pembayaran;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
        
    }

    public String getAlamat() {
        return alamat;
        
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

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getTtl() {
        return ttl;
    }
    
}
