package ex_11_Strings;

import java.util.Scanner;

public class Reverse_String_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";
        for ( int i = input.length()-1; i>=0; i-- ){
            result = result + input.charAt(i);

        }
        System.out.println(result);

    }
}
