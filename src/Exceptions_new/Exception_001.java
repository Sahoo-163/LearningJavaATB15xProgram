package Exceptions_new;

import java.util.Scanner;

public class Exception_001 {
    public static void main(String[] args) {
        System.out.println("Program has started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(100/num); // Arithmetic exception
        System.out.println("Program is completeed");
        System.out.println("Exit from the program");
    }
}
