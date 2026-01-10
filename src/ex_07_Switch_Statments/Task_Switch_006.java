package ex_07_Switch_Statments;

public class Task_Switch_006 {
    public static void main(String[] args) {
        int a =11;

        switch(-1){
            default:
                System.out.println("Not in category");
                break;
            case -1:
                System.out.println("Output is correct");
                break;
            case 9:
                System.out.println("the number is 9");
                break;
        }
    }
}
