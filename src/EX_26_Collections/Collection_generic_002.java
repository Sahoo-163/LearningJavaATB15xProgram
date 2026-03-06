package EX_26_Collections;

public class Collection_generic_002 {
    public static void main(String[] args) {
        temp(3, 7);
        temp("pramod", " chinmay");
    }

    static  <chin> chin temp(chin a, chin b) {
        System.out.println(a);
        System.out.println(b);
        return  null;
    }
}
