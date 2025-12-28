package ex_03_Ternary_operator;

public class ternary_operator_nested {
    public static void main(String[] args) {
        //max of three numbers
        int a = 4;
        int b = 9;
        int c = -11;

        String max_numner = (a>b)? (b>c ? "b is grater": "c is gretar") : "a is greater" ;
        System.out.println( max_numner);

    }
}
