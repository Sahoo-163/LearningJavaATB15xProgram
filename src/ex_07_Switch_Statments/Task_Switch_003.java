package ex_07_Switch_Statments;

import java.util.Scanner;

public class Task_Switch_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits");

        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");

        }
    }
}
