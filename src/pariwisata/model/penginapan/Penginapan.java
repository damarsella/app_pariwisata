package pariwisata.model.penginapan;

public class Penginapan {
    
    private Long id;
    private String name;
    private String gender;
    private String religion;
    private String contact;
    private String lodging;
    private String price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLodging() {
        return lodging;
    }

    public void setLodging(String lodging) {
        this.lodging = lodging;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Penginapan{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", religion=" + religion + ", contact=" + contact + ", lodging=" + lodging + ", price=" + price + '}';
    }
    
}
