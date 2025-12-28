package ex_05_If_Condition;

public class TasK_06_Another_Intparse {
    public static void main(String[] args) {
        System.out.println("Just find one number");
        int num = Integer.parseInt(args[0]);
        System.out.println(num);
        if (num > 80){
            System.out.println(" it is correct");
        }
        else {
            System.out.println("not a corrcect number");
        }
    }
}
