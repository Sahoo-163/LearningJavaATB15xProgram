package ex_10_Functions;

public class Task_all_functions_005 {
    public static void main(String[] args) {
        wop_wor_function(); //without para without return type
       int num =  wop_wrt_function();   // without para with return type
          wp_wor("chinmay", 9,10 )  ;                  // with para without return type
         int sum  =  wp_wor(90,89) ;                   // with para with return type
    }

     static int wp_wor(int i, int i1) {
        return i+i1;

    }

    static void wp_wor(String chinmay, int i, int i1) {
    }

    static void  wop_wor_function() {
    }

    static int  wop_wrt_function() {
        return 9 ;
    }
}
