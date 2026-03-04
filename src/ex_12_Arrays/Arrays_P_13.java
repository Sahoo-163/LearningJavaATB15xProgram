package ex_12_Arrays;

public class Arrays_P_13 {
    public static void main(String[] args) {
        int a [] = { 10, 20, 60, 80, 20};
        int search_element = 60;

        boolean status = false;
        for ( int x:a){
            if (x==search_element){
                System.out.println("Element is found");
                status = true;
                break;
            }

            }
        if ( status == false) {
            System.out.println("Element not found");
        }
    }
}
