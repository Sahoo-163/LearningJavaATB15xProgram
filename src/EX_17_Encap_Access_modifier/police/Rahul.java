package EX_17_Encap_Access_modifier.police;

public class Rahul extends cop{
    public Rahul(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
        cop r = new cop(80);
        r.CanIshoot();
        r.thisisDefault();

    }
}
