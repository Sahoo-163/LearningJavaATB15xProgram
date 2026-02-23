package EX_25_Wrapper_class;

public class Wrapper_class_001 {
    public static void main(String[] args) {
        String num = "10";
        int aa = 100;
// String -->> Wrapper class
        Integer a = Integer.parseInt(num);
        System.out.println(a);
        Double d = Double.parseDouble(num);
        System.out.println(d);
        Float f = Float.parseFloat(num);
        System.out.println(f);
        Long l = Long.parseLong(num);
        System.out.println(l);
    }
}
