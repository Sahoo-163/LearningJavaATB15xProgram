package ex_12_Arrays;

import java.util.Arrays;

public class Arrays_P_16 {
    public static void main(String[] args) {

        int a[] = {20, 10,50,40, 100,60, 80};

        System.out.println("Before sorting of arrays");
        System.out.println( Arrays.toString(a));

        System.out.println("After sorting of arrays");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
