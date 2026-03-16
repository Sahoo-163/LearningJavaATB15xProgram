package EX_28_SET_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program_003 {
    public static void main(String[] args) {
         Set<Integer> st = new HashSet<>();
         st.add (90);
         st.add(30);
         st.add(40);
         st.add(20);
        System.out.println(st);

//        Iterator iterator = st.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (Integer num:st){
            System.out.println(num);

        }

    }
}
