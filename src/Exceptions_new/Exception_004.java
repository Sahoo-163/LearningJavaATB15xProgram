package Exceptions_new;

import java.util.Scanner;


public class Exception_004 {
    public static void main(String[] args) {
        System.out.println("Program is started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr any number");
        int num = sc.nextInt();
        try {
            System.out.println(100/num);
        }
        catch (ArithmeticException e){
            System.out.println( "Invalid exception");
        }
        System.out.println("Endd of the program");
    }
}
