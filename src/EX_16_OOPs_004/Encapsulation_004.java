package EX_16_OOPs_004;

public class Encapsulation_004 {
    public static void main(String[] args) {
        Bank B1 = new Bank("Chinmay", 234241414, 9000);
        System.out.println( B1.getAccountname());
        B1.setAccountname("Rohan");
        System.out.println( B1.getAccnum());
        B1.setAccnum(000002333);
        System.out.println( B1.getBalanc());


        System.out.println( B1.getAccountname());


    }
}


class Bank{
    private   String Accountname;
    private int accnum;
    private  double balanc;

    Bank( String Accountname, int accnum, double balanc){
        this.Accountname = Accountname;
        this.balanc = balanc;
        this.accnum = accnum;
    }


    public String getAccountname() {
        return Accountname;
    }

    public void setAccountname(String accountname) {
        this.Accountname = accountname;
    }

    public int getAccnum() {
        return accnum;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public double getBalanc() {
        return balanc;
    }

    public void setBalanc(double balanc) {
        this.balanc = balanc;
    }





}