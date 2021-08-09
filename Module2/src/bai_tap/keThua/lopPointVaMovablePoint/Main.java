package keThua.lopPointVaMovablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(20,30);
        System.out.println(point.toString());
        point.setX(10);
        point.setY(20);
        System.out.println(point.toString());
        point = new MoveablePoint(point.getX(),
                point.getY(),
                10,
                20);
        System.out.println(point.toString());
        ((MoveablePoint) point).move();
        System.out.println(point.toString());
        MoveablePoint anotherPoint = new MoveablePoint(20,20);
        System.out.println(anotherPoint.toString());
        anotherPoint.move();
        System.out.println(anotherPoint.toString());
    }
}
