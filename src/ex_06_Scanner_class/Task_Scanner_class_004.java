package ex_06_Scanner_class;

import java.util.Scanner;

public class Task_Scanner_class_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if ( d > 10.5){
            System.out.println(" its a doube");
        } else if (d < 6) {
            System.out.println("not in category");

        }
    }
}
