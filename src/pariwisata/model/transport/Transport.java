package pariwisata.model.transport;

public class Transport {
    
   private int id;
   private String nama;

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

    @Override
    public String toString() {
        return "Transport{" + "id=" + id + ", nama=" + nama + '}';
    }
   
}
