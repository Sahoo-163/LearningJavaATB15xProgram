package ex_05_If_Condition;

public class Task_05_IntParse {
    public static void main(String[] args) {
        System.out.println("Enter the age\n");
        int digit = Integer.parseInt(args[0]);
        if( digit == 90){
            System.out.println("it is correct");
        }
        else {
            System.out.println("it is wrong");
        }
    }
}
