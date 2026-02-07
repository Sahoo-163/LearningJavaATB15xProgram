package EX_15_OOPs_003.Polymorphism.Method_Overloading_Overiding;

public class Last_Method_overloading {
    public static void main(String[] args) {
        LearnAutomation L1 = new LearnAutomation();
        L1.APIautomation("Backend API",90);
        L1.selenium( "wEBDRIVER", 33, 90.98 );
    }


}

class LearnAutomation{
    void selenium( String browser, int digit, double decimal ){
        System.out.println("Firefox browser"+ browser);
        System.out.println("number of browsers"+ digit);
        System.out.println("No of decimal in browser"+ decimal);
    }

    void APIautomation( String API, int apinumns){
        System.out.println("POST api"+ API);
        System.out.println("number of API requests"+ apinumns);
    }
}
