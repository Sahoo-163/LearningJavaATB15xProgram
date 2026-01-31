package EX_14_OOPs_002.Multilevel_inheritance;

public class Main_method_all {
    public static void main(String[] args) {

        Son_chinmay s1 = new Son_chinmay();
        s1.own_property();
        s1.proprty();
        s1.fatherproperty();

        Father F1 = new Father();
        F1.fatherproperty();
        F1.proprty();

        Grandfather G1 = new Grandfather();
        G1.proprty();
    }
}
