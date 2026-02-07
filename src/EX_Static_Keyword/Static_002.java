package EX_Static_Keyword;

public class Static_002 {
    public static void main(String[] args) {
        college c1 = new college("chinmay");
        System.out.println( c1.name);
        System.out.println(c1.age);
        college.university();
        college c2 = new college("sahoo");
        System.out.println(c2.name);
        System.out.println(c2.age);


    }
}


class college{
    static  int age = 90;
    String name;

    college(  String studentname){
        this.name = studentname;


    }

    static  void university(){
        System.out.println("this is a college wih studenst");
    }
}
