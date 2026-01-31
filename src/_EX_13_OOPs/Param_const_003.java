package _EX_13_OOPs;

public class Param_const_003 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println(p1.cost);
        Pen p2 = new Pen("Gel",90, "2022");
        System.out.println( p2.cost);
        System.out.println( p2.model);
        System.out.println( p2.name);
    }
}


class Pen {
    String name;
    int cost;
    String model;

    Pen(){
        name =" Reynols";
        cost = 40;
        model =" 2016";

    }

    Pen( String nameofpen, int costofpen, String modelofpen){
        this.name = nameofpen;
        this.cost = costofpen;
        this.model = modelofpen;
    }
}