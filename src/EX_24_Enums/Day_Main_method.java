package EX_24_Enums;

public class Day_Main_method {
    public static void main(String[] args) {
        Day current_day = Day.SUNDAY;
        System.out.println( current_day);
        System.out.println( current_day.name());
        System.out.println( current_day.ordinal());

        System.out.println( Enum_001.Amazon);
        System.out.println( Day.valueOf("Thursday"));
        System.out.println(Enum_001.valueOf("Hotstar"));

    }
}
