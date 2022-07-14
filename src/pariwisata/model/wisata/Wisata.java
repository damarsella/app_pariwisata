package pariwisata.model.wisata;

public class Wisata {
    
    private Long id;
    private String tourPackages;
    private String price;
    private String idLodging;
    private String nameLodging;
    private String idTransport;
    private String nameTrasport;
    private String foodPackage;
    private String addFoodPackage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTourPackages() {
        return tourPackages;
    }

    public void setTourPackages(String tourPackages) {
        this.tourPackages = tourPackages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(String idTransport) {
        this.idTransport = idTransport;
    }

    public String getNameTrasport() {
        return nameTrasport;
    }

    public void setNameTrasport(String nameTrasport) {
        this.nameTrasport = nameTrasport;
    }

    public String getFoodPackage() {
        return foodPackage;
    }

    public void setFoodPackage(String foodPackage) {
        this.foodPackage = foodPackage;
    }

    public String getAddFoodPackage() {
        return addFoodPackage;
    }

    public void setAddFoodPackage(String addFoodPackage) {
        this.addFoodPackage = addFoodPackage;
    }

    @Override
    public String toString() {
        return "Wisata{" + "id=" + id + ", tourPackages=" + tourPackages + ", price=" + price + ", idLodging=" + idLodging + ", nameLodging=" + nameLodging + ", idTransport=" + idTransport + ", nameTrasport=" + nameTrasport + ", foodPackage=" + foodPackage + ", addFoodPackage=" + addFoodPackage + '}';
    }
    
}
