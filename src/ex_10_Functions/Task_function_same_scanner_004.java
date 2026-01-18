package ex_10_Functions;

import java.util.Scanner;

public class Task_function_same_scanner_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values to take sum");
        int a = sc.nextInt();
        System.out.println("Provide the value of A");
        int b = sc.nextInt();
        System.out.println("Provide the value of B");
       sum_of_num(a,b);
        System.out.println(sum_of_num(a,b));
        no_output();
    }
    static int sum_of_num(int x, int y){
        return x+y;

    }

    static void no_output(){
        System.out.println("No output for this function");
    }

}
