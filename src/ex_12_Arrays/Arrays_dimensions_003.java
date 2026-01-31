package ex_12_Arrays;

public class Arrays_dimensions_003 {
    public static void main(String[] args) {

        int [] [] matrix = {{ 20, 40,  20},
                            {30, 80,  30},
                            { 50,  5, 4}};

        for ( int i = 0; i < matrix.length; i++) {
            for ( int j =0 ; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " |");

            }
            System.out.println( " ");
        }

    }

}
