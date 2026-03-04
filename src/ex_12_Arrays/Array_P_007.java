package ex_12_Arrays;

public class Array_P_007 {
    public static void main(String[] args) {
        int b[][] = { {20,40},
                {10,60},
                {30,80}};
        for( int arr[]:b){
            for ( int u : arr){
                System.out.print(u+" ");
            }
            System.out.println();
        }
    }
}
