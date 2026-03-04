package ex_12_Arrays;

import java.util.Arrays;

public class Arrays_P_18 {
    public static void main(String[] args) {
        char a[] = { 'd', 'u','o','l','h'};
        for ( int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("=======");
        Arrays.sort(a);
        for (int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
