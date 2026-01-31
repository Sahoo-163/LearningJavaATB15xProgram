package ex_12_Arrays;

public class Arrays_deimension_002 {
    public static void main(String[] args) {
        int [][] matrix = {{10, 20, 30},
                           {40, 20, 10},
                           {30, 40, 40 }};

         for ( int i = 0 ; i<matrix.length; i++){
             for ( int j =0; j < matrix[i].length; j++) {
                 System.out.print(matrix[i][j] + " |");

             }
             System.out.println( " ");
         }
    }
}
