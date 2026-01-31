package EX_14_OOPs_002;

public class Combine_commontcs_and_Testcase {
    public static void main(String[] args) {
        Testcase tc1 = new Testcase();
        tc1.Startbrowser();
        tc1.closebrowser();
        tc1.readdatabasefile();
        tc1.readexcelfile();
    }
}
