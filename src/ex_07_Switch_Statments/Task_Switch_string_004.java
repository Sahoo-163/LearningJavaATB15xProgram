package ex_07_Switch_Statments;

import java.util.Scanner;

public class Task_Switch_string_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name");

        String browser = sc.next();
        browser= browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox"    :
                System.out.println("starting the forefox browser");
                break;
            case "edge"    :
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("None of them falling in category");
        }

    }
}
