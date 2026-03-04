package ex_12_Arrays;

public class Arrays_P_14 {
    public static void main(String[] args) {
        int a [] = { 10, 30,40, 10, 60, 10, 70, 10};
        int num = 10;
        int count = 0;

        for ( int x:a){
            if ( x==num){
                count ++;
            }
        }
        System.out.println( count);
    }
}
