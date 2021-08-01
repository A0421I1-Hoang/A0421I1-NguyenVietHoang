package bai_tap.lopVaDoiTuongTrongJava.Fan;

public class Fan {
    private int speed;
    private double radius;
    private boolean isTurnOn;
    private String color;

    Fan (int speed, double radius, boolean isTurnOn, String color){
        this.speed=speed;
        this.radius=radius;
        this.isTurnOn= isTurnOn;
        this.color= color;
    }
    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.isTurnOn = true;
    }

    void display(){
        System.out.println("Co toc do la "+this.speed+" radius la "+this.radius+
                " co mau la "+this.color+", va quat dang o trang thai "+ (this.isTurnOn ?"On":"Off"));
    }
}
