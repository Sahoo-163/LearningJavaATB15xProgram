package ex_03_Ternary_operator;

public class ternary_operator_005 {
    public static void main(String[] args) {
        // max of two numbers using ternary operators
        int a = 40;
        int b = 30;

        String max = a>b ? "a is greater" : "b is greater";
        System.out.println( max);

        String min = a<b ? "a is smallest" : "b is smallest";
        System.out.println( min);


    }
}
