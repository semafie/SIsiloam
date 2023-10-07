
package entity;

public class data_dokter implements Entity{
    public static String tableName = "data_dokter";
    private int id, no_hp, no_antrian;
    private String nama, jenis_poli, jadwal, tanggal;

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

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggal() {
        return tanggal;
    }
    
}
