package EX_15_OOPs_003.Polymorphism.Method_Overloading_Overiding;


class MathOperator_001 {
    int add ( int a , int b){
        return a+b;
    }

    int add ( int a , int b , int c) {
        return a + b + c;
    }
    double dob ( double a , double b, double c){
        return  a+b+c;

    }
    String add ( String a, String b, String c){
        return a + b+c;
    }
}