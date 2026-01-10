package ex_07_Switch_Statments;

import java.util.Scanner;

public class Task_same_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits from 1 to 7 in days");

        if(sc.hasNextInt()) {

            int weekday = sc.nextInt();
            switch (weekday) {
                case 1:
                    System.out.println("its monday");
                    break;
                case 2:
                    System.out.println("its tuesday");
                    break;
                case 3:
                    System.out.println("its wedne");
                    break;
                case 4:
                    System.out.println("its thur");
                    break;
                case 5:
                    System.out.println("its fri");
                    break;
                case 6:
                    System.out.println("its sat");
                    break;
                case 7:
                    System.out.println("its sun");
                    break;
                default:
                    System.out.println("None of them fall in category");
            }

        }

        else {
            System.out.println("you are providing wrong data");
        }


    }
}
