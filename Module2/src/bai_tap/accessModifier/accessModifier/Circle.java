package bai_tap.accessModifier.accessModifier;

public class Circle {
    private double radius;
    private String color;

    Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14*this.radius*this.radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void display(){
        System.out.println("Hinh tron co ban kinh la "+this.radius+" co mau "+this.color+" va co dien tich la "+this.getArea());
    }
}
