package EX_23_Exceptions;

public class Try_catch_method_002 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try{
            a = 10/c;
        } catch ( ArithmeticException e) {
            System.out.println( " thiis is ans arithmeatc error");
        }
        catch ( Exception e){
            System.out.println( " normal error");
        }
    }
}
