package EX_23_Exceptions;

public class try_catch_003 {
    public static void main(String[] args) {
      //  int a = Integer.parseInt(args[0]);
        int c = 0;
        try{
            c = 10/c;
        } catch (Exception e){
            System.out.println( e.getMessage());
        }
        finally {
            System.out.println(" i will be always executed");
        }
    }
}
