package EX_19_Super_Keyword;

public class Super_class_002 {
    public static void main(String[] args) {
        Car c1 = new Car(90);
       // System.out.println(c1);
        c1.message();
        c1.test();
        c1.drive();
        c1.noTest();



    }



}

class Vehicle {
    public int maxspeed = 180;

    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a){
        System.out.println("Param const");
    }
    Vehicle(int a, int b){
        System.out.println("Two param const");
    }

    void message(){
        System.out.println("This is a normal method");
    }
    void  message(int a ){
        System.out.println("this a parmetrized method");
    }
    void drive(){
        System.out.println("Driving of car");
    }
    void noTest(){
        System.out.println(" This is an empty method");
    }
}

class  Car extends  Vehicle{
    private   int maxspeed= 920;

    Car(){
        super(180);

    }
    Car( int a ){
        System.out.println("Parametrized car const under car class");
    }

    void test(){
        System.out.println(" this is a test method for THIS fucntionality");
    }
    @Override
    void drive() {
        super.drive();
        this.test();
        this.message();
        super.noTest();
    }
}
