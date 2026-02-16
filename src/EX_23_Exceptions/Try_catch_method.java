package EX_23_Exceptions;

public class Try_catch_method {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Output wont be executed");
        }
        System.out.println("2");
    }
}
