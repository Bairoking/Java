public class Conversion {
    // field, global or instance variable
    double centimeters;
    double meters;
    double kilometers;
    double feet;
    double inches;

    // constructor
    public Conversion(double cm) {
        this.centimeters = cm;
    }
   public static double toMeter(double centimeters) {
       double m = (centimeters * 0.01);
       return m;
    }
    public static double toKiloMeter(double centimeters) {
        double km = ((centimeters * 0.01) / 1000);
        return km;
    }
    public static double toFeet(double centimeters) {
        double ft = (centimeters * 0.0328084);
        return ft;
    }
    public static double toInch(double centimeters) {
        double in = (centimeters * 0.393701);
        return in;
   }
    public static void main(String[] args) {
        System.out.println("enter centimeters: ");
        System.out.print("meters: "+ Conversion.toMeter(200)+"\n");
        System.out.print("kilometers: "+Conversion.toKiloMeter(300)+"\n");
        System.out.print("feet: "+Conversion.toFeet(400)+"\n");
        System.out.print("inches: "+Conversion.toInch(500));
    }
}
