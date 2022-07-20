package pariwisata.model.pengunjung;

public class Pengunjung {
    
    private int id;
    private String nama;
    private String alamat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Pengunjung{" + "id=" + id + ", nama=" + nama + ", alamat=" + alamat + '}';
    }
    
}
