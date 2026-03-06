package EX_26_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collecgtion_generic_006 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add ( "chinmauy");
        list.add(90);
        list.add (90.90);
        list.add (true);
        list.add (76812);
        list.add(false);

        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(90));
        System.out.println(list.contains("true"));
        System.out.println(list.indexOf("9"));

        System.out.println(list);
    for (int i =0 ; i<list.size();i++){
        System.out.println(list.get(i));
    }

        System.out.println("============");

    for ( Object o:list){
        System.out.println(o);
    }
        System.out.println("============");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
