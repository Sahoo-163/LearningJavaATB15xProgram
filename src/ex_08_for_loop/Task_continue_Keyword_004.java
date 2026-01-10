package ex_08_for_loop;

import java.util.Scanner;

public class Task_continue_Keyword_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any random number");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}
