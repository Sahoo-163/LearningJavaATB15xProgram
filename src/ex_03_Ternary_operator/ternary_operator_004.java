package ex_03_Ternary_operator;

public class ternary_operator_004 {
    public static void main(String[] args) {
        int my_age = 10;
        String condition = my_age >18 ? ( my_age > 25 ? "i can drink" : " i can't drink") :"Not allowed" ;
        System.out.println( condition);
    }
}
