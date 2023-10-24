
package repository;

public class datapasienbarusementara {
    private String norm,nama,nik,alamat, ttl,jnk;
    public datapasienbarusementara(){
        
    }
    public datapasienbarusementara(String norm,String nama,String nik,String alamat,String ttl,String jnk){
        this.norm =norm;
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.jnk = jnk;
        this.ttl = ttl;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setJnk(String jnk) {
        this.jnk = jnk;
    }

    public String getJnk() {
        return jnk;
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

    public void setNorm(String norm) {
        this.norm = norm;
    }

    public String getNorm() {
        return norm;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getTtl() {
        return ttl;
    }
    
}
