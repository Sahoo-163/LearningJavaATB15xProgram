package EX_27_Arraylist_Linkedlist;

import java.util.*;

public class Program_001 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List <String> list2 = new LinkedList<>();
        List<Integer> list3 = new ArrayList<>();
        list.add("chinmay");
        list.add("Sahoo");
        list.add("Family");

        list2.add("Sush");
        list2.add("Sahoo");
        list2.add("Family");

        list3.add(90);
        list3.add(20);
        list3.add(30);

        System.out.println("Print the list of elements present");

        for (Object name:list){
            System.out.println(name);
        }
        System.out.println("===========================");
        for ( int i = 0; i<list2.size(); i++){
            System.out.println(list2.get(i));
        }
        System.out.println("=====================");
        Iterator iterator = list3.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
