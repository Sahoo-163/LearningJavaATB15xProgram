package ex_12_Arrays;

import java.util.Arrays;

public class Arrays_P_17 {
    public static void main(String[] args) {
        System.out.println("Before sorting");
        int a [] = { 20, 10, 90, 30, 40, 70};
        for ( int x : a){
            System.out.println(x);
        }
        System.out.println("========");
        System.out.println("After sorting");
        Arrays.sort(a);
        for ( int x : a){
            System.out.println(x);
        }
    }
}
