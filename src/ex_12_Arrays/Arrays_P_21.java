package ex_12_Arrays;

import java.util.Arrays;

public class Arrays_P_21 {
    public static void main(String[] args) {
        String a []= { "sin", "chin", "bin", "yin"};
        System.out.println("Before sorting of String");
        System.out.println( Arrays.toString(a));
        Arrays.sort(a);
        System.out.println( Arrays.toString(a));
    }
}
