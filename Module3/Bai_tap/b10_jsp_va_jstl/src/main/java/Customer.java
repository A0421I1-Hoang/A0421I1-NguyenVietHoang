public class Customer {
    private String name = "";
    private int age = 0;
    private String PictureLink = "img/default.png";
    private String Address = "";
    private String birthday = "";

    public Customer(String name, String address, String birthday) {
        this.name = name;
        Address = address;
        this.birthday = birthday;
    }

    public Customer(String name, int age, String address, String birthday) {
        this.name = name;
        this.age = age;
        Address = address;
        this.birthday = birthday;
    }

    public Customer(String name, String pictureLink, String address, String birthday) {
        this.name = name;
        PictureLink = pictureLink;
        Address = address;
        this.birthday = birthday;
    }

    public Customer(String name, int age, String pictureLink, String address, String birthday) {
        this.name = name;
        this.age = age;
        PictureLink = pictureLink;
        Address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPictureLink(String pictureLink) {
        PictureLink = pictureLink;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPictureLink() {
        return PictureLink;
    }

    public String getAddress() {
        return Address;
    }

    public String getBirthday() {
        return birthday;
    }
}
