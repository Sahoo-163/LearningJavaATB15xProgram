package EX_18_Encap_Access_modifier_002.Patient;

public class Rogi_03 extends  Rogi_01{
    public Rogi_03(int count, String coma) {
        super(count, coma);
    }

    public static void main(String[] args) {
        Rogi_01 r8 = new Rogi_01(60,"Hand");
        r8.hospitallocation();
        r8.hospital();
    }
}
