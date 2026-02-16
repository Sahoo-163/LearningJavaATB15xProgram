package EX_23_Exceptions;

public class duplicate_try_catch_003 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("normal arithmatci error");
        }
        catch ( Exception e ){
            System.out.println( e.getMessage());
        }
    }
}