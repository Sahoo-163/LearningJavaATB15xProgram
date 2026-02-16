package Exceptions_new;

import java.util.Scanner;

public class Exception_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "WLCMOME"; //NumberFormatException
       int num = Integer.parseInt(s);
        System.out.println(num);
    }
}
