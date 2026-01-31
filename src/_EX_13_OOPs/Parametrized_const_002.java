package _EX_13_OOPs;

public class Parametrized_const_002 {
    public static void main(String[] args) {
       animal a1 = new animal();
        System.out.println(a1);
    }
}


class  animal{
    String name ;

    animal (){
        System.out.println("no const-defalut");
    }

}