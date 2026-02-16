package Exceptions_new;

import java.util.Scanner;

public class Exception_002 {
    public static void main(String[] args) {
        System.out.println("Program is started");
        Scanner sc = new Scanner(System.in);
        int a [] = null;
        try {
            a = new int [10];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter the position from 0-10");
        int pos = sc.nextInt();
        System.out.println("Entr the values of position");
        int value = sc.nextInt();

        a [pos] = value; // Array out of bound exception
        System.out.println( a[pos]);
        System.out.println("Program is end");
    }
}
