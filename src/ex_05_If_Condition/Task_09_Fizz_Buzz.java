package ex_05_If_Condition;

public class Task_09_Fizz_Buzz {
    public static void main(String[] args) {
        int num = 13;
        if (num %3==0 ){
            System.out.println("the number is fizz");
        } else if (num %5 ==0) {
            System.out.println("the num is buzz");

        }
        else{
            System.out.println(" not even fizz or not even buzz");
        }
    }
}
