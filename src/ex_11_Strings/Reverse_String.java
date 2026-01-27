package ex_11_Strings;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String reverse = "";
        for (int i= input.length()-1;i>=0;i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);

    }
}
