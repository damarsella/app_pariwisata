package pariwisata.model.pengunjung;

public class Pengunjung {
    
    private Long id;
    private String nama;
    private Long nik;
    private Long telepon;
    private String alamat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Long getNik() {
        return nik;
    }

    public void setNik(Long nik) {
        this.nik = nik;
    }

    public Long getTelepon() {
        return telepon;
    }

    public void setTelepon(Long telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Pengunjung{" + "id=" + id + ", nama=" + nama + ", nik=" + nik + ", telepon=" + telepon + ", alamat=" + alamat + '}';
    }
    
    
}
