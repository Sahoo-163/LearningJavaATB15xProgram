package EX_15_OOPs_003.Polymorphism.Method_Overloading_Overiding;

public class Main_method_MethodOveriding {
    public static void main(String[] args) {
        MathOperator_001 m1 = new MathOperator_001();
        System.out.println(  m1.add(3,4,5));
        System.out.println(    m1.add(45, 99));
        System.out.println(  m1.add(" pUBNA", " ASDJHA", "SJDHG"));
        System.out.println( m1.dob(90.30, 78.30, 66.90));
    }
}
