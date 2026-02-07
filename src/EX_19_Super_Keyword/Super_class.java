package EX_19_Super_Keyword;

public class Super_class {
    public static void main(String[] args) {
        Ninja n = new Ninja();
        n.Test();
    }

}

class Baseclass{
    private  String Candidates;
    private  int num;

    public int getNum() {return num;}

    public void setNum(int num) {this.num = num;}

    public String getCandidates() {return Candidates;}

    public void setCandidates(String candidates) {Candidates = candidates;}

    Baseclass(){
        System.out.println("DC- Parent");
    }

    Baseclass( String name, int count){
        this.Candidates = name;
        this.num = count;
        System.out.println("Param const");
    }

}

class Ninja extends  Baseclass {
    void Test(){}

   Ninja(){
     super("Himadri",90);
     super.getCandidates();
     super.getNum();
       System.out.println(super.getCandidates());


   }

}
