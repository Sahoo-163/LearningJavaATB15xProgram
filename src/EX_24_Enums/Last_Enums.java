package EX_24_Enums;

public class Last_Enums {
    public static void main(String[] args) {
        System.out.println(bikes.FZS.getCc());
        System.out.println(bikes.PASSION.getCc());
        System.out.println(bikes.ROYAL_ENFILED.getCc());
        bikes b = bikes.PASSION;
        System.out.println(b);
    }
}


enum  bikes{
    ROYAL_ENFILED(200000, 250),
    FZS ( 150000, 150),
    PASSION( 100000, 100);

    private final int cost;
    private final int cc;

    bikes( int COST, int CC ){
        this.cost= COST;
        this.cc = CC;
    }

    public int getCc() {
        return this.cc;
    }

    public int getCost() {
        return this.cost;
    }

}