package pariwisata.model.transport;

public class Transport {
    
    private Long id;
    private String nameTransport;
    private String nameDriver;
    private String contact;
    private String gender;
    private String passanger;
    private String price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassanger() {
        return passanger;
    }

    public void setPassanger(String passanger) {
        this.passanger = passanger;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transport{" + "id=" + id + ", nameTransport=" + nameTransport + ", nameDriver=" + nameDriver + ", contact=" + contact + ", gender=" + gender + ", passanger=" + passanger + ", price=" + price + '}';
    }
    
}
