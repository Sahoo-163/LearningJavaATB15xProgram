package EX_28_SET_;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program_002 {
    public static void main(String[] args) {
        Set<String> sett = new HashSet();
        sett.add ("Ornage");
        sett.add ("Ornage");
        sett.add ( "Pineapple");
        sett.add ( "Musk");
        //sett.add ( 123123);
        System.out.println( sett);
        System.out.println(sett.contains("Ornage"));
        System.out.println(sett.remove("Musk"));
        System.out.println(sett);

        System.out.println("-------------------------------");

        Set<Integer> lt = new LinkedHashSet();
//        lt.add( "Bike");
//        lt.add( "car");
//        lt.add("car");
//        lt.add("House");
//        lt.add("Site");
        lt.add(76217631);
        System.out.println(lt);
        System.out.println(lt.isEmpty());
        System.out.println(lt.remove(76217631));

        System.out.println("-------------------------------");


        Set TS = new TreeSet();
        TS.add( "Tree");
        TS.add("Plants");
        TS.add( "Sapline");
        System.out.println(TS);

    }
}
