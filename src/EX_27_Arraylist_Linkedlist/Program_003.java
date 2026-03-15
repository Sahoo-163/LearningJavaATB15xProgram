package EX_27_Arraylist_Linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coninput = "C";
        List<String> names = new ArrayList<>();

        while (coninput.equalsIgnoreCase("C")){
            System.out.println("Enter the name you want to access");
            String name = sc.next();
            names.add(name);
            sc.nextLine();
            System.out.println("Do you want to enter another name?Y/N");
            coninput = sc.nextLine();

        }
       for(String name : names){
           System.out.println(name);
       }
 
    }
}
