package EX_15_OOPs_003.Polymorphism.Method_Overloading_Overiding;

public class Another_Method_Overloading {
    public static void main(String[] args) {
        LaunchBrowser l1 = new LaunchBrowser();
          l1.CheckBrowser( "Firefox", 90);
        l1.OpenBrowser();
    }
}

class LaunchBrowser{
    void OpenBrowser(){
        System.out.println(" No browser ie, default");
    }

    void  CheckBrowser( String browser, int num){
        System.out.println("Check the browser"+ browser);
        System.out.println( " Assgn number to browser"+ num);
    }
}
