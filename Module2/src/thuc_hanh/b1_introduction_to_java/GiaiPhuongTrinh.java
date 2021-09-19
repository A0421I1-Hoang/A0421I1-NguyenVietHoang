import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main (String[] args){
        System.out.println("Given a equation as 'a*x+b=0', please enter constants: ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a = ");
        double a=scanner.nextDouble();
        System.out.println("b = ");
        double b=scanner.nextDouble();
        double x=-b/a;
        System.out.println("x = "+x);
    }
}
