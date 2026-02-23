package EX_24_Enums;

public class ENUM_Advance {
    public static void main(String[] args) {
        Planet p = Planet.MERCURY;
        double d = Planet.MERCURY.surfaceGravity();
        System.out.println(d);
        System.out.println(p);
        System.out.println(Planet.MERCURY.surfaceGravity());
    }


}


enum  Planet {
    MERCURY( 9.009, 89.90),
    URANUS ( 90.09, 993.90),
    NEPTUNE ( 110.90, 200.90);



    private final double Mass;
    private final double Radius;

    Planet (double mass, double radius){
        this.Mass = mass;
        this.Radius = radius;
    }

    public double getMass() {
        return Mass;
    }

    public double getRadius() {
        return Radius;
    }

    public double surfaceGravity(){
        final  double G = 9.09809;
        return  G * Mass* Radius;
    }
}