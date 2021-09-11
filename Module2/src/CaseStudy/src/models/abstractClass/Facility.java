package models.abstractClass;

public abstract class Facility {
    public String name;
    public double area;
    public double price;

    public Facility(){}

    public Facility(String name, double area, double price) {
        this.name=name;
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}
