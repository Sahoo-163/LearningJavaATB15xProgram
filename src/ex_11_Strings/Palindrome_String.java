package ex_11_Strings;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindrome_input = sc.next();
        String Reverse_Palindrome = "";

        for (int i = palindrome_input.length()-1;i>=0; i--){
            Reverse_Palindrome = Reverse_Palindrome + palindrome_input.charAt(i);
        }
        if (Reverse_Palindrome.equalsIgnoreCase(palindrome_input) ){
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
