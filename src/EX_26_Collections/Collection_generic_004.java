package EX_26_Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Collection_generic_004 {

    public static void main(String[] args) {
        List<String> mylist = new ArrayList(); // hardcoding it to Strings
        mylist.add(" chinmay");
        mylist.add("23321");
        mylist.add("false");

        List <Integer> urlist = new ArrayList<>(); // hardcoding this to Integers
        urlist.add(2134);
        urlist.add(00000);
        urlist.add(34234242);
        System.out.println(urlist);
        System.out.println(mylist);

    }
}
