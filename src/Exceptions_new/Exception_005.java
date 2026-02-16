package Exceptions_new;

public class Exception_005 {
    public static void main(String[] args) {
        System.out.println("Enter any string");

        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" End of program");
    }
}
