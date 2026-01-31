package _EX_13_OOPs;

public class Parametrized_const_003 {
    public static void main(String[] args) {
        objects b1 = new objects(" GUNA SHEKAR");
        System.out.println(b1.name);
        objects b2 = new objects( " prmaod hsjs");
        System.out.println( b2.name);
    }
}


class objects{
    String name;

    objects( String name){
        this.name = name;

    }
}