package EX_25_Wrapper_class;

public class Autobox__Unbox {
    public static void main(String[] args) {
        int a = 10;
        Integer b= a; // here we are converting primitive to wrapper class
        System.out.println(b.byteValue());// basically this is boxing


        Integer aa = 100;
        int a1 = aa; // Unboxing// ie, converting wrapper into primitive
        System.out.println( a1);
    }
}
