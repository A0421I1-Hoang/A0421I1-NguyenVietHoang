package models.abstractClass;

public abstract class Person {
    public String name;
    public int age;
    public boolean isMale;
    public int CMND;
    public String birthday;
    public int phoneNumber;
    public String Email;

    public Person(){}

    public Person(String name, int age, boolean isMale, int CMND, String birthday, int phoneNumber, String Email){
        this.name=name;
        this.age=age;
        this.isMale=isMale;
        this.CMND=CMND;
        this.birthday=birthday;
        this.phoneNumber=phoneNumber;
        this.Email=Email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", CMND=" + CMND +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", Email='" + Email + '\'' +
                '}';
    }
}
