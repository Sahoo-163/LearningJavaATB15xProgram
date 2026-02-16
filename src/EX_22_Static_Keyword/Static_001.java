package EX_22_Static_Keyword;

public class Static_001 {
    public static void main(String[] args) {
        student s1 = new student(90);
        System.out.println(s1.age);
        student s2 = new student(80);
        System.out.println(s2.age);

        System.out.println( s1.course);
        System.out.println(s2.course);
    }

}

class student{
    int age;
    static  String course ="ATB";

    public student( int batchage){
        this.age= batchage;
    }
    static  void studentclass(){
        System.out.println(" this is a student batch mehthod");
    }

}
