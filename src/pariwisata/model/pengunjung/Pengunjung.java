package pariwisata.model.pengunjung;

public class Pengunjung {
    
    private Long id;
    private String name;
    private String gender;
    private String address;
    private String religion;
    private String contact;
    private String destination;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Pengunjung{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", religion=" + religion + ", contact=" + contact + ", destination=" + destination + '}';
    }

      
}
