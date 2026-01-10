package ex_07_Switch_Statments;

public class Task_switch_new_005 {
    public static void main(String[] args) {
        int itemcode = 00;
        switch(itemcode){
            case 001,002,003 -> System.out.println("it is within the range");
            case 004,006,005 -> System.out.println("it is not within the given range");
            default -> System.out.println("Not even presnst");
        }

    }
}
