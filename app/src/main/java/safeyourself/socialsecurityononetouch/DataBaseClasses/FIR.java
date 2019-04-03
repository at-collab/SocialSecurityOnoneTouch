package safeyourself.socialsecurityononetouch.DataBaseClasses;

public class FIR {

    String full_name, address, cnic,contact,email,complain;

    public FIR(String full_name, String address, String cnic, String contact, String email, String complain) {
        this.full_name = full_name;
        this.address = address;
        this.cnic = cnic;
        this.contact = contact;
        this.email = email;
        this.complain = complain;
    }

    public FIR() {
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }
}
