package ex_08_for_loop;

public class Task_for_loop_001 {
    public static void main(String[] args) {
        //print the numbers from 1 to 50 both odd and even
        for (int i=1; i<=50; i++){
//            if ( i%2==0){
//                System.out.println("Even number"+ i);
//
//            }
            if(i%2!=0)
            {
                System.out.println("Odd number"+ i);
            }
        }

    }
}
