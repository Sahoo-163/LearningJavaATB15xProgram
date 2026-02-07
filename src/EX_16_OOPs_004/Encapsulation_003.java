package EX_16_OOPs_004;

public class Encapsulation_003 {
    public static void main(String[] args) {
        ICICIbANK IC1 = new ICICIbANK( "Chinmay", 1000);
        System.out.println( IC1.getBalance());
        System.out.println( IC1.getName());

    }
}


class ICICIbANK{


    private String name;
    private int Balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    ICICIbANK (String Accountname, int BankBalance){
        this.name = Accountname;
        this.Balance = BankBalance;

    }

}