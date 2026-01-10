package ex_06_Scanner_class;

import java.util.Scanner;

public class Task_Scanner_class_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name = sc.next();

        if ( name == "chinmay")
        {
            System.out.println("he is a gud guy");
        } else if (name == "XYZ") {
            System.out.println("He is a stranger");
        }
        else{
            System.out.println("Not in category");
        }
    }
}
