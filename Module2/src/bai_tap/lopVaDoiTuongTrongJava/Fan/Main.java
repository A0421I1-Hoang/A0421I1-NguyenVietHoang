package bai_tap.lopVaDoiTuongTrongJava.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 =new Fan(3, 10, true, "yellow");
        Fan fan2= new Fan(2, 5, false, "blue");
        fan1.display();
        fan2.display();
    }
}
