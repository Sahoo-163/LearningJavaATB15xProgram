package ex_12_Arrays;

public class Arrays_P_12 {
    public static void main(String[] args) {
        int a [] = {20, 40, 10, 80, 90, 60};
        int element= 100;
        boolean status = false;
        for ( int i =0 ; i <a.length; i++){
            if ( a[i]== element){
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if ( status == false) {
            System.out.println("Element not found");
        }
    }
}
