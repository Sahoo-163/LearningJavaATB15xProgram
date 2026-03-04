package ex_12_Arrays;

import java.util.Arrays;

public class Arrays_P_20 {
    public static void main(String[] args) {

        String a [] = {" mak", "jak", "lak", "chin"};

        for (String x:a){
            System.out.println(x);
        }
        System.out.println("============");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
