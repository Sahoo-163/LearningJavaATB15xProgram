package EX_15_OOPs_003.Polymorphism.Method_Overloading_Overiding;

public class Overiding_001 {
    public static void main(String[] args) {
         son s1 = new son();
         s1.home();
         Father01 f1 = new Father01();
         f1.home();

         Father01 f2 = new son();
         f2.home();
    }
}

class Father01{
    void  home(){
        System.out.println( "2bhk");
    }
}

class  son extends  Father01{
    @Override
    void home(){
        System.out.println( " 3bhk");
    }
}
