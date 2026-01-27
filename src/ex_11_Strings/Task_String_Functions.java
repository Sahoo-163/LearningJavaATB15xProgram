package ex_11_Strings;

public class Task_String_Functions {
    public static void main(String[] args) {
        int id = "java".indexOf("a");
        System.out.println(id);
        int id1 ="java".lastIndexOf("a");
        System.out.println(id1);
        int id2 = "Language".indexOf("u");
        System.out.println(id2);
        boolean b = "".isEmpty();
        System.out.println(b);
        String s11 = String.join("*","Chinmay","Sahoo");
        System.out.println(s11);
        String s12 = "Java".replace('a','i');
        System.out.println(s12);
        String s13 = "Chinmay".concat("Sahoo");
        System.out.println(s13);
        boolean v2 = "java".startsWith("op");
        System.out.println(v2);
        boolean b2 = "Mava".endsWith("ma");
        System.out.println(b2);

    }
}
