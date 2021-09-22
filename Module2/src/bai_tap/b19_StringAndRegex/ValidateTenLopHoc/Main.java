package b19_StringAndRegex.ValidateTenLopHoc;

public class Main {
    private static Name nameExample;
    public static final String[] name1 = new String[] { "C0318G", "M0318G", "P0323A" };

    public static void main(String[] args) {
        Name ten = new Name();
        for (String check : name1) {
            boolean isvalid = ten.validate(check);
            System.out.println("Class name is " + check +" is valid: "+ isvalid);
        }
    }
}
