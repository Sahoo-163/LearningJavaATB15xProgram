package ex_08_for_loop;

public class Task_for_Even_continue_006 {
    public static void main(String[] args) {
        for (int i = 0; i<=40; i++){
            if( i%2==0){ //even number will be skipped in this because of continue keyword
                continue;
            }
            System.out.println(i);

        }
    }
}
