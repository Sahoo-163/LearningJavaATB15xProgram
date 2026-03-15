package EX_27_Arraylist_Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program_002 {
    public static void main(String[] args) {
        LinkedList <String> mylist = new LinkedList<>();
        mylist.add("Mango");
        mylist.add("Apple");
        mylist.add("Cherry");
        mylist.add("Blossom");
        mylist.add("xyz");
        mylist.addFirst("Water");
        mylist.addLast("musk");

        System.out.println(mylist);
        System.out.println(mylist.getFirst());
        System.out.println(mylist.contains("Water"));
        System.out.println(mylist.contains(4234));
        System.out.println(mylist.remove("Blossom"));
        System.out.println(mylist.size());


    }
}
