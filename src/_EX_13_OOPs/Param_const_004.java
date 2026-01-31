package _EX_13_OOPs;

public class Param_const_004 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println( c1);
        Car c2 = new Car("Tata",30000);
        System.out.println( c2.carname);
        System.out.println( c2.cost);

    }
}


class  Car{
    String carname;
    int cost;

     Car(){
         System.out.println( " Default-const");
     }

     Car( String name , int price ){
         this.carname = name;
         this.cost =  price;
     }


}