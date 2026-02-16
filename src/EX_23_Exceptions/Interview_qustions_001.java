package EX_23_Exceptions;

public class Interview_qustions_001 {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
            int a = 10 / 0;
        } catch (NullPointerException  |ArithmeticException e){
            System.out.println("null error and Arithmetic error");

        }
        catch (Exception e ){
            System.out.println("Another exception");
        }

    }
}
