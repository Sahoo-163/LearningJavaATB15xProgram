package ex_10_Functions;

import java.util.Scanner;

public class Task_function_scanner_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the o/p based upon the type of user defined functions");
        int a = sc.nextInt();
        System.out.println("Enter the value for a");
        int b = sc.nextInt();
        System.out.println("Ennter the value for b");
        int sum = sum_of_int(a,b);
        System.out.println(sum);
        invalid_int();

    }

    static int sum_of_int(int x, int y){
        return x+y;

    }
    static void invalid_int(){
        System.out.println("you there");
    }
}
