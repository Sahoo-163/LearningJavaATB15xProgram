package EX_23_Exceptions;

public class Handling_exception {
    public static void main(String[] args) {
        int a = 0;
        try {
            a= 10/0;
        } catch (Exception e) {
            System.out.println("this is not possible");
        }
        System.out.println(a);
    }
}
