package ex_04_Increment_Decrement_operator;

public class Task_008 {
    public static void main(String[] args) {
        int a = 3;
        int b= a++ * ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
