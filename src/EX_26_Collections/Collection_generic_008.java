package EX_26_Collections;

import java.util.ArrayList;
import java.util.List;

public class Collection_generic_008 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add ( "ORANGE");
        list.add ("APPLE");
        list.add ("PINAPPLE");
        System.out.println(list);

        List list1 = new ArrayList<>();
        list1.add("Cherry");
        list1.add ("Cheeku");
        list1.add ( "Strawberry");

        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add ( " Tomato");
        list2.add ( " Potato");
        list2.add(" yam");

        System.out.println(list2);

        List list_all_veg_fruits = new ArrayList<>();
        list_all_veg_fruits.add(list);
        list_all_veg_fruits.add(list1);
        list_all_veg_fruits.add(list2);
        System.out.println(list_all_veg_fruits);
        System.out.println(list_all_veg_fruits.size());
        System.out.println(list_all_veg_fruits.get(2));


    }
}
