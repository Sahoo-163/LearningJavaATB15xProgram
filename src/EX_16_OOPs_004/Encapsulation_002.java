package EX_16_OOPs_004;

public class Encapsulation_002 {
    public static void main(String[] args) {

        goodLogin v1 = new goodLogin(" Sahoo", "1321" );
        System.out.println( v1.getPasword());
        System.out.println( v1.getUsername());
         v1.setPasword("090909");
         v1.setUsername(" Prem");
        System.out.println( v1.getPasword());
        System.out.println( v1.getUsername());

    }
}

class goodLogin{
    private String username;
    private String  pasword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }


    goodLogin ( String username, String pasword){
         this.pasword= pasword;
         this.username = username;
     }


}