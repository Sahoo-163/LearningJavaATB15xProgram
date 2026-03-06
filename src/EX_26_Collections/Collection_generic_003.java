package EX_26_Collections;

public class Collection_generic_003 {
    public static void main(String[] args) {
        mansion("null","pointer");
        mansion(10, 30);
        mansion( true, false);
        mansion(20.78, 90.20);


    }

    static <kiran> kiran mansion( kiran x, kiran y){
        System.out.println(x);
        System.out.println(y);
        return  null;
    }
}
