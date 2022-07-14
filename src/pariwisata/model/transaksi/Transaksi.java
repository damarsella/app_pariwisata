package pariwisata.model.transaksi;

public class Transaksi {
    
    private Long id;
    private Double idTour;
    private String tourPackages;
    private String tourPrice;
    private String viaPayment;
    private String idLodging;
    private String nameLodging;
    private Long idUser;
    private String nameuser;
    private String foodDescrip;
    private String addFoodDescrip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getIdTour() {
        return idTour;
    }

    public void setIdTour(Double idTour) {
        this.idTour = idTour;
    }

    public String getTourPackages() {
        return tourPackages;
    }

    public void setTourPackages(String tourPackages) {
        this.tourPackages = tourPackages;
    }

    public String getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(String tourPrice) {
        this.tourPrice = tourPrice;
    }

    public String getViaPayment() {
        return viaPayment;
    }

    public void setViaPayment(String viaPayment) {
        this.viaPayment = viaPayment;
    }

    public String getIdLodging() {
        return idLodging;
    }

    public void setIdLodging(String idLodging) {
        this.idLodging = idLodging;
    }

    public String getNameLodging() {
        return nameLodging;
    }

    public void setNameLodging(String nameLodging) {
        this.nameLodging = nameLodging;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getFoodDescrip() {
        return foodDescrip;
    }

    public void setFoodDescrip(String foodDescrip) {
        this.foodDescrip = foodDescrip;
    }

    public String getAddFoodDescrip() {
        return addFoodDescrip;
    }

    public void setAddFoodDescrip(String addFoodDescrip) {
        this.addFoodDescrip = addFoodDescrip;
    }

    @Override
    public String toString() {
        return "Transaksi{" + "id=" + id + ", idTour=" + idTour + ", tourPackages=" + tourPackages + ", tourPrice=" + tourPrice + ", viaPayment=" + viaPayment + ", idLodging=" + idLodging + ", nameLodging=" + nameLodging + ", idUser=" + idUser + ", nameuser=" + nameuser + ", foodDescrip=" + foodDescrip + ", addFoodDescrip=" + addFoodDescrip + '}';
    }
    
}
