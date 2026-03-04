package ex_12_Arrays;

public class Arrays_P_0011 {
    public static void main(String[] args) {
        int a[] = { 30,10, 50, 90, 40};
        int element_search = 50;
        for ( int i =0; i< a.length; i++){
         if  ( a[i]== element_search){
             System.out.println("Element is found");
             break;
         }

        }
        System.out.println("Element not found");
    }
}
