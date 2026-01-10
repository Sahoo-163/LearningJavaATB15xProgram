package ex_07_Switch_Statments;

import java.util.Scanner;

public class Task_switch_same_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits from 1 to 7 to find the days");
      //   int day = sc.nextInt();

         if (sc.hasNextInt()) {
             int day = sc.nextInt();
             switch (day) {
                 case 1:
                     System.out.println("Mon");
                     break;
                 case 2:
                     System.out.println("Tue");
                 case 3:
                     System.out.println("Wed");
                     break;
                 case 4:
                     System.out.println("Thur");
                     break;
                 case 5:
                     System.out.println("Frid");
                     break;
                 case 6:
                     System.out.println("Sat");
                     break;
                 case 7:
                     System.out.println("Sun");
                     break;

                 default: {
                     System.out.println("None of them fall in this category");
                 }
             }
         }

         else{
             System.out.println("Invalid int is entered");
         }

    }
}
