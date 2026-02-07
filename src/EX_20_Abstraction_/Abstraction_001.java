package EX_20_Abstraction_;

public class Abstraction_001 {
    public static void main(String[] args) {
        Father f1 = new son();
        f1.loan50k();
        f1.loan10k();

        son S1 = new son();
        S1.loan50k();
        S1.loan10k();


    }
}

abstract  class  Father{
      abstract  void loan50k();
      void loan10k(){
          System.out.println("Amount given by father");
      }
}


class  son extends  Father{

    @Override
    void loan50k() {
        System.out.println("Amount given by son");
    }
}