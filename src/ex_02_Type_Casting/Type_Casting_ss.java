package ex_02_Type_Casting;

public class Type_Casting_ss {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;   // widening concept --> implicit
        float a1 = b;
      //  boolean b1 = b; incompatible and this is not possible

        System.out.println(b);

    }
}
