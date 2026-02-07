package EX_18_Encap_Access_modifier_002.Patient;

public class Rogi_02 {
    public static void main(String[] args) {
        Rogi_01 r3 = new Rogi_01(200,"lEG");
        r3.hospital();
        r3.hospitallocation();
        System.out.println( r3.disease);
        System.out.println(r3.num);
    }
}
