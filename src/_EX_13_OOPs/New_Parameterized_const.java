package _EX_13_OOPs;

public class New_Parameterized_const {
    public static void main(String[] args) {
        place p1 = new place("Jammu");
        System.out.println(p1.name);
        place p2 = new place( "kashnir");
        System.out.println(p2.name);
        place p3 = new place( "India");
        System.out.println(p3.name);
    }
}

class  place {
    String name;

    place ( String placename ){
        this.name = placename;

    }
}
