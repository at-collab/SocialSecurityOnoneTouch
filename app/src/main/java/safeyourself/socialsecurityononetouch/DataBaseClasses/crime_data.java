package safeyourself.socialsecurityononetouch.DataBaseClasses;

public class crime_data {
    String image, info, location ;


    public crime_data(String image, String info, String location) {
        this.image = image;
        this.info = info;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public crime_data() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
