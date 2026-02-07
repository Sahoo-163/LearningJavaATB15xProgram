package EX_15_OOPs_003.Polymorphism.Method_Overloading_Overiding;

public class Automation_Overiding {
    public static void main(String[] args) {
         Baseclass B1 = new Baseclass();
         B1.CommonBroswer();
         Chromebroswer C1 = new Chromebroswer();
         C1.CommonBroswer();

         Firefox f1 = new Firefox();
         f1.CommonBroswer();

         Baseclass b2 = new Chromebroswer();
         b2.CommonBroswer();

         Baseclass b3 = new Firefox();
         b3.CommonBroswer();


    }
}

class  Baseclass{

    void CommonBroswer(){
        System.out.println( " this is the common for Chrome, Fire, geko");
    }
}
class  Chromebroswer extends  Baseclass{
    void CommonBroswer(){
        System.out.println(" this is for only chromebrowser");
    }
}

class  Firefox extends  Baseclass{
    void CommonBroswer(){
        System.out.println(" this is only for firefoxbroswer");
    }
}
