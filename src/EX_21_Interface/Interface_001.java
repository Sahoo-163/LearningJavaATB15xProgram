package EX_21_Interface;

public class Interface_001 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
    }
}






class Car implements brakes,Engine1 {

    public void drive(){
        applybrakes();
        applyclutch();
        StartEngine();
        StopEngine();
        testEngine();
        Engine1.RunEngine();

    }

    @Override
    public void applybrakes() {
        System.out.println("this is used for applying brakes");
    }

    @Override
    public void applyclutch() {
        System.out.println("This is used for applying clutch");
    }

    @Override
    public void StartEngine() {
        System.out.println("thi is used for staring engine");

    }

    @Override
    public void StopEngine() {
        System.out.println("this is used for stopong engine");

    }
}


interface brakes{
    void applybrakes();
    void applyclutch();
}

interface Engine1{
    void StartEngine();
    void StopEngine();

    default void testEngine(){
        System.out.println("this is a default testEngine");
    }
    static void RunEngine(){
        System.out.println("this is a static runEngine");
    }
}