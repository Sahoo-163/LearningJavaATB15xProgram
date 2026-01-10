package ex_06_Scanner_class;

import java.util.Scanner;

public class Task_Scanner_class_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if ( age>90){
            System.out.println( "he is a aged guy");
        } else if (age<90) {
            System.out.println("He can survive");
        }
        else {
            System.out.println("he does not fall in the category");
        }
    }
}
