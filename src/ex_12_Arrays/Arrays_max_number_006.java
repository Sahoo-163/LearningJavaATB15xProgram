package ex_12_Arrays;

public class Arrays_max_number_006 {
    public static void main(String[] args) {
        int [] array = { 12, 34, 45, 57, 90, 27, 18, 30};
        int max =array[0] ;
        for ( int i = 0; i< array.length; i++){

            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
