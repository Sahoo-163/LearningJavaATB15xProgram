package EX_21_Interface;

public class Interface_003 {
    public static void main(String[] args) {
        SON S1 = new SON();
        S1.MainProperty();

    }
}


class  SON extends  mother implements father1,father2{

    public void MainProperty(){
        CASH1();
        BATWARA1();
        BATWARA2();
        money1();
        MOTHERPROPETY();

    }

    @Override
    public void CASH1() {
        System.out.println("this is father1 property cash1");
    }

    @Override
    public void BATWARA1() {
        System.out.println("this is fathe1 batwara 1");
    }

    @Override
    public void money1() {
        System.out.println("this is father2 money 1");
    }

    @Override
    public void BATWARA2() {
        System.out.println( "this is father2 batwara 2");
    }

    @Override
    void MOTHERPROPETY() {
        System.out.println("this is mother prop ");

    }
}

interface father1{
    void CASH1();
    void BATWARA1();

}

interface  father2{
    void money1();
    void BATWARA2();
}

abstract class mother{
    abstract void MOTHERPROPETY();

}