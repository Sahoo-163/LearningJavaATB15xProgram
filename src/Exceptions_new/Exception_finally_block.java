package Exceptions_new;

public class Exception_finally_block {
    public static <exception extends Throwable> void main(String[] args) {
        System.out.println("Program started");
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println( "Handled the exception");
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("This is the final statement");
        }
        System.out.println( "Program ends now");
    }
}
