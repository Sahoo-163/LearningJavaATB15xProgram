package EX_15_OOPs_003.Polymorphism.Method_Overloading_Overiding;

public class Practise_Overriding {
    public static void main(String[] args) {
        MainFoundation m1 = new MainFoundation();
        m1.home();
        Roof r1 = new Roof();
        r1.home();
        Floor2nd f1 = new Floor2nd();
        f1.home();

        MainFoundation m2 = new Roof();
        m2.home();
        MainFoundation m3 = new Floor2nd();
        m3.home();
    }

}

class MainFoundation{
    void home(){
        System.out.println(" this is for house constriction");
    }
}

class Roof extends  MainFoundation{
    void home(){
        System.out.println(" this is for top roof");
    }
}

class Floor2nd extends  MainFoundation{
    void home(){
        System.out.println(" This id for 2nd flooe house");
    }
}