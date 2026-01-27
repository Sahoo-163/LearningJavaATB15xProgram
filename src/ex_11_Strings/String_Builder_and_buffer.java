package ex_11_Strings;

public class String_Builder_and_buffer {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Devansi");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer("Airaa");
        buffer.append(" Sahoo");
        System.out.println(buffer);
        System.out.println(buffer.length());
        System.out.println(buffer.reverse());
    }
}
