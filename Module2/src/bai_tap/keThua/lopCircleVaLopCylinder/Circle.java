package keThua.lopCircleVaLopCylinder;

public class Circle {
    private double radius;
    private String color;
    private double area;
    private double perimeter;

    public Circle(){};

    public Circle (double radius,String color,double area,double perimeter){
        this.radius=radius;
        this.color=color;
        this.area=area;
        this.perimeter=perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = this.radius*this.radius*Math.PI;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", area=" + area +
                ", perimeter='" + perimeter + '\'' +
                '}';
    }
}

