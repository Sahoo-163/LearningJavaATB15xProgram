package ex_08_for_loop;

public class Task_for_Odd_continue_007 {
    public static void main(String[] args) {
        for (int i = 0; i<20;i++){
            if( i%2 !=0){ // odd number will be skipped here becuase of contine key word and here we have used not equal to operator
                continue;
            }
            System.out.println(i);
        }
    }
}
