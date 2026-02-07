package EX_20_Abstraction_;

public class Abstaraction_002 {
    public static void main(String[] args) {
        Nexon n1 = new Nexon();
       n1.drive();
        Thar t1 = new Thar();
        t1.drive();
    }
}

class  Thar extends  Nexon{

    void tharride(){
        super.drive();
    }
}

class Nexon extends Vehicle{

   void drive(){
       shortdrive();
       longdrive();
       officedrive();

    }
    @Override
    void shortdrive() {
        System.out.println("Within bengaluru ride");
    }

    @Override
    void longdrive() {
        System.out.println("Outside bengaluru ride");

    }
}


abstract class Vehicle{
    abstract void shortdrive();
    abstract void longdrive();
    void officedrive(){
        System.out.println("Only for office purpose");
    }
}
