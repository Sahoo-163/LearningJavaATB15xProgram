package ex_02_Type_Casting;

public class Type_casting_realexamples {
    public static void main(String[] args) {
        int roll = 100;
        float g = 90.09f;
       // System.out.println(roll+g);

       // int f = roll + g; // narrowing implicit
      //  int f = roll +(int)g; // narrowing explicit
        //System.out.println(f);
       // float o = roll + g; // widening implicit
        float o = g + (float)roll; // widening explicit
        System.out.println(o);

    }
}
