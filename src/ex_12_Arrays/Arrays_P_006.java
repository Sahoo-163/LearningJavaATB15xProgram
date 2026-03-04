package ex_12_Arrays;

public class Arrays_P_006 {
    public static void main(String[] args) {
        int a[][] = {{ 30, 50,90},
                {90,40,30},
                {30,50,50}};
        for ( int r = 0; r<a.length;r++ ) // row
        {
            for ( int c = 0;c<a[r].length ; c++) // column
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
    }
}
