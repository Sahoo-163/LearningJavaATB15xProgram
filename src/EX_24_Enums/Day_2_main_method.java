package EX_24_Enums;

public class Day_2_main_method {
    public static void main(String[] args) {
         Day today = Day.Thursday;

         switch (today ){
             case Tuesday -> System.out.println("Tuesday");
             case Thursday -> System.out.println("Thursday");
         }

    }
}
