package ex_08_for_loop;

import java.util.Scanner;

public class Task_same_continue_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any random num");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){

            if(i == 10){
                continue;

            }
            System.out.println(i);
        }
    }
}
