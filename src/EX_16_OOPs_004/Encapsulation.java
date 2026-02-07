package EX_16_OOPs_004;

public class Encapsulation {
    public static void main(String[] args) {
        VWOlogin login = new VWOlogin("Chinmauy", "ABCD@1234");
        System.out.println( login.password);
        login.password = " 87822@djhbs";
        System.out.println(login.password);

    }
}

class VWOlogin{

   public String username;
   public String password;

   VWOlogin ( String name, String pwd){
       this.username = name;
       this.password = pwd;


   }


}