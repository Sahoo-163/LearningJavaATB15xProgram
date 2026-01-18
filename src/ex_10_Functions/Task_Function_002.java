package ex_10_Functions;

public class Task_Function_002 {
    public static void main(String[] args) {
        main_of_function();
        in_of_function();
        double_the_value();
        enter_pie_value();
    }

    static void main_of_function() {
        System.out.println("Print the o/p of main function");
    }

    static int in_of_function() {
        System.out.println("here we print the int values");
        return 10;
    }

    static double double_the_value(){
        System.out.println("here we are printing double values");
        return 50.423232;
    }
    static  float enter_pie_value(){
        System.out.println("here we are enterinng the pie value");
        return  3.783f;

    }
}
