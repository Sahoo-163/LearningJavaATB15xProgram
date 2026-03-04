package ex_12_Arrays;

public class Arrays_P_15 {
    public static void main(String[] args) {
        int a [] = { 20, 40, 20, 90, 20, 70, 20};
        int num = 20;
        int count =0;

        for ( int i =0; i <a.length; i++){
            if(a[i] == num){
                count++;
            }
        }
        System.out.println(count);
    }
}
