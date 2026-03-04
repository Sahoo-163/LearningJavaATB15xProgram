package ex_12_Arrays;

public class Arrays_P_004 {
    public static void main(String[] args) {
        int a[][] = new int[4][3];
        a[0][0]= 20;
        a[0][1]= 30;
        a[0][2]= 10;

        a[1][0]= 70;
        a[1][1]=40;
        a[1][2]=80;

        a[2][0]= 22;
        a[2][1]=88;
        a[2][2]=90;

        a[3][0]=44;
        a[3][1]=55;
        a[3][2]=79;

        System.out.println(a[2][1]);
        System.out.println(a.length);
        System.out.println(a[1].length);
        System.out.println(a[2][2]);

    }
}
