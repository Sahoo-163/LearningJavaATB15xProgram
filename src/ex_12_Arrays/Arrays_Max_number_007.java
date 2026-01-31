package ex_12_Arrays;

public class Arrays_Max_number_007 {
    public static void main(String[] args) {
        int [] arrays = { 48, 29, 89, 39, 40, 29, 40, 20, 12};

        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] >max ){
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}
