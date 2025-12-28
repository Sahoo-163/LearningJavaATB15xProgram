package ex_05_If_Condition;

public class Task_001_if_statement {
    public static void main(String[] args) {
        System.out.println("Enter the age via CLI option\n");
        int age = Integer.parseInt(args[0]);
        if (age>19){
            System.out.println( "Eligible for vote");
        }
        else {
            System.out.println("Not eligible");
        }

    }

}
