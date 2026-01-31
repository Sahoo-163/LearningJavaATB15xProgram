package ex_11_Strings;

import java.util.Scanner;

public class Replica_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string as palindrome");
        String input = sc.next();
        String Palindrome_string ="";

        for ( int i = input.length()-1; i>=0; i--){
            Palindrome_string = Palindrome_string + input.charAt(i);
        }
        if (Palindrome_string.equalsIgnoreCase(input)){
            System.out.println("Is a plaindrome");
        }
        else {
            System.out.println("nOT A PALINDROME");
        }
    }
}
