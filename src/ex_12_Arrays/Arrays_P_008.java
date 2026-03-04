package ex_12_Arrays;

public class Arrays_P_008 {
    public static void main(String[] args) {
        int a[][] = { {20, 50,66,77},
                {10, 80,33,44},
                { 70,30,22,39}};
        for ( int i = 0; i<=2;i++){
            for ( int j =0; j<=3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
