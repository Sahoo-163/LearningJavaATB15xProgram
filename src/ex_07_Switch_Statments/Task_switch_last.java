package ex_07_Switch_Statments;

public class Task_switch_last {
    public static void main(String[] args) {
        char code = 'c';
        switch (code){
            default :
                System.out.println("its a correct one");
                break;
            case 'A':
                System.out.println(" out of boundary");
                break;
            case 'B' :
                System.out.println("Inside the case");
                break;

        }
    }
}
