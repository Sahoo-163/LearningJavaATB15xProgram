package Exceptions_new;

public class Exception_finally_block_001 {
    public static void main(String[] args) {
        System.out.println("Stared the program");
        String s = "Chinmay";

        try{
            System.out.println( s.length());
        }
        catch (Exception e){
            System.out.println("Handling of exception");
            System.out.println( e.getMessage());
        }
        finally {
            System.out.println(" here in the final blcok");
        }

        System.out.println("End of the program");
    }
}
