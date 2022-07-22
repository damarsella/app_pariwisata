package pariwisata.model.transaksi;

import java.util.Date;

public class Transaksi {
    
    private Long id;
    private int id_wisata;
    private String paket_wisata;
    private int harga_wisata;
    private String via_pembayaran;
    private int id_penginapan;
    private String nama_penginapan;
    private int id_pengunjung;
    private String nama_pengunjung;
    private String deskripsi_makanan_minuman;
    private String deskripsi_tambahan;
    private Date dari;
    private Date sampai;
    private int total_tanggal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_wisata() {
        return id_wisata;
    }

    public void setId_wisata(int id_wisata) {
        this.id_wisata = id_wisata;
    }

    public String getPaket_wisata() {
        return paket_wisata;
    }

    public void setPaket_wisata(String paket_wisata) {
        this.paket_wisata = paket_wisata;
    }

    public int getHarga_wisata() {
        return harga_wisata;
    }

    public void setHarga_wisata(int harga_wisata) {
        this.harga_wisata = harga_wisata;
    }

    public String getVia_pembayaran() {
        return via_pembayaran;
    }

    public void setVia_pembayaran(String via_pembayaran) {
        this.via_pembayaran = via_pembayaran;
    }

    public int getId_penginapan() {
        return id_penginapan;
    }

    public void setId_penginapan(int id_penginapan) {
        this.id_penginapan = id_penginapan;
    }

    public String getNama_penginapan() {
        return nama_penginapan;
    }

    public void setNama_penginapan(String nama_penginapan) {
        this.nama_penginapan = nama_penginapan;
    }

    public int getId_pengunjung() {
        return id_pengunjung;
    }

    public void setId_pengunjung(int id_pengunjung) {
        this.id_pengunjung = id_pengunjung;
    }

    public String getNama_pengunjung() {
        return nama_pengunjung;
    }

    public void setNama_pengunjung(String nama_pengunjung) {
        this.nama_pengunjung = nama_pengunjung;
    }

    public String getDeskripsi_makanan_minuman() {
        return deskripsi_makanan_minuman;
    }

    public void setDeskripsi_makanan_minuman(String deskripsi_makanan_minuman) {
        this.deskripsi_makanan_minuman = deskripsi_makanan_minuman;
    }

    public String getDeskripsi_tambahan() {
        return deskripsi_tambahan;
    }

    public void setDeskripsi_tambahan(String deskripsi_tambahan) {
        this.deskripsi_tambahan = deskripsi_tambahan;
    }

    public Date getDari() {
        return dari;
    }

    public void setDari(Date dari) {
        this.dari = dari;
    }

    public Date getSampai() {
        return sampai;
    }

    public void setSampai(Date sampai) {
        this.sampai = sampai;
    }

    public int getTotal_tanggal() {
        return total_tanggal;
    }

    public void setTotal_tanggal(int total_tanggal) {
        this.total_tanggal = total_tanggal;
    }
    
    
}
