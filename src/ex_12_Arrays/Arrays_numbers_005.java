package ex_12_Arrays;

public class Arrays_numbers_005 {
    public static void main(String[] args) {
        int [] marks = { 20, 27, 18, 38, 19,29};
        System.out.println( marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        System.out.println("=========");
        for ( int mark : marks){

            System.out.println( mark);
        }
        System.out.println("=========");

        for ( int i = 0 ; i< marks.length ; i++){
            System.out.println( marks[i]);
        }
    }
}


