package _EX_13_OOPs;

public class Parameterized_Const_001 {
    public static void main(String[] args) {
        human h1 = new human("Chinmay");
        human h2 = new human( "sahoo");
        System.out.println( h1.name);
        System.out.println(h2.name);

    }


}


class  human{
   String name;
    human (String namegiven){
    this.name = namegiven;
    }
}

