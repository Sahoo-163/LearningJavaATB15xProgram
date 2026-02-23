package EX_24_Enums;

public class Enum_Advance_002 {
    public static void main(String[] args) {
        double d = Country.INDIA.countrylocation();
        System.out.println(d);
        double c = Country.EUROPE.getMass();
        System.out.println(c);
        double c1 = Country.USA.getMass();
        System.out.println(c1);



    }
}


enum Country{
    INDIA(90,200),
    USA(100,40),
    EUROPE(30, 10);

    private final  double Mass;
    private final double Radius;

    Country( double mass, double radius){
        this.Mass = mass;
        this.Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double getMass() {
        return Mass;
    }

    double countrylocation(){
        final double h =200;
        return h*getMass()*getRadius();
    }
}