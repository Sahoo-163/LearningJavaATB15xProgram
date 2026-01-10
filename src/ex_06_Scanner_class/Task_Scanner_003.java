package ex_06_Scanner_class;

import java.util.Scanner;

public class Task_Scanner_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        float f = sc.nextFloat();

        if ( f > 10.5){
            System.out.println( " it is greater than 10.5");
        } else if (f < 11.9) {
            System.out.println(" its is less than 12");
        }
        else{
            System.out.println("does not fall in category");
        }
    }
}
