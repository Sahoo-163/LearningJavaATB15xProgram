package EX_17_Encap_Access_modifier.police;

public class cop {

    private int gun;
    private String idcard;

    public cop( int bullet){
        this.gun= bullet;
    }

   protected void CanIshoot(){
        System.out.println("Yes i can shoot");
    }
    void thisisDefault(){
        System.out.println("Hi cop");
    }
}
