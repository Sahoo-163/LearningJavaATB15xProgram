package ex_03_Ternary_operator;

public class ternary_operator_006 {
    public static void main(String[] args) {
        //even and odd number using ternary operator

        int a = 40;
        int b = 33;

        String num = (a%2==0) ? "EVEN" : "ODD";
        String num1 = (b%2==0) ? "EVEN" : "ODD";
        System.out.println( num);
        System.out.println( num1);
    }
}
