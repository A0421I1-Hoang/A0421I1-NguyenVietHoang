package b19_StringAndRegex.ValidatePhoneNumber;

public class Main {
    private static PhoneNumber phoneNumber;
    public static final String[] number = new String[] { "84-0978489648", "a8-22222222", "3t-124836957821" };

    public static void main(String[] args) {
        PhoneNumber phone = new PhoneNumber();
        for (String check : number) {
            boolean isvalid = phone.validate(check);
            System.out.println("Class name is " + check +" is valid: "+ isvalid);
        }
    }
}
