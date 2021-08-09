package keThua.lopCircleVaLopCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("red");
        Cylinder cylinder=new Cylinder();
        cylinder.setHeight(10);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}

