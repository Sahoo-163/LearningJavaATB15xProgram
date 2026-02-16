package EX_23_Exceptions;

public class Mutiple_try_catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("this wont be executed");
        }catch (Exception e) {
            System.out.println("this wont be executed");
        }
    }
}
