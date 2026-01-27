package ex_11_Strings;

public class Task_String_Interview_04 {
    public static void main(String[] args) {
        String s = "JAVA";
        char c = s.charAt(3);
        System.out.println(c);

        int result = "ABC".compareTo("abc");
        System.out.println( result);
        int result1 = "abc".compareTo("ABC");
        System.out.println(result1);
        int result2 = "abc".compareTo("abc");
        System.out.println(result2);
        int result3 = "ABC".compareTo("abc");
        System.out.println(result3);

    }
}
