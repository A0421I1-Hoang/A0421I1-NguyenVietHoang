package keThua.lopCircleVaLopCylinder;

public class Cylinder extends Circle {

    private double height;
    private double volume;

    public Cylinder(){};
    public Cylinder(double radius, String color, double area, double perimeter,double height,double volume) {
        super(radius, color, area, perimeter);
        this.height=height;
        this.volume=volume;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2*super.getPerimeter()*height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
