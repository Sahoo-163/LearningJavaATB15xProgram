package EX_14_OOPs_002;

public class Runner_Class_Son_father {
    public static void main(String[] args) {
        sonclass s1 = new sonclass();
        System.out.println( s1.gold);
        System.out.println(s1.silver);
        s1.bhk2();
        s1.bhk3();

        father f1 = new father();
        System.out.println( f1.gold);
        f1.bhk2();
    }
}
