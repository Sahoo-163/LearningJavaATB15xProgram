package ex_11_Strings;

public class Task_String_Interview_03 {
    public static void main(String[] args) {
          String s1 = "Pramod";
          String s4 = "Pramod";
          String s8 = "pramod";

          String s6 = new String("pRamOd");
          String s5 = new String("PrAmOd");
          String s3 = new String("PRAMOD");

        System.out.println(s1==s4);
        System.out.println(s1==s3);
        System.out.println(s8==s1);


        System.out.println(s3==s6);
        System.out.println(s5==s6);
        System.out.println(s1.equals(s1));
        System.out.println(s3.equals(s8));
        System.out.println(s3.equals(s1));
    }
}
