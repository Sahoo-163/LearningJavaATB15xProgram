package EX_27_Arraylist_Linkedlist;

import java.util.Stack;

public class Program_004 {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.add("Pramod");
        s.add(" Sahoo");
        s.add("Mishra");
        System.out.println(s);
        System.out.println(s.add("Chinmay"));
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.push("Sushmitha"));
        System.out.println(s);
        System.out.println(s.add("ABHI"));
        System.out.println(s.add("abhi"));
        System.out.println(s.add(234));
        System.out.println(s);
        s.add(5,"vinod");
        System.out.println(s);
    }
}
