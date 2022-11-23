public class Trapezium {
//    instance variable
    public int a;
    public int b;
    public int h;
//    constructors
    public Trapezium(){
        a = 10;
        b = 7;
        h = 4;
    }
//    method for calculating area
    public double Area(){
        double A = (0.5*((a+b)*h));
        return A;
    }
//    method for calculating perimeter
    public double Perimeter(){
        double s = a-b;
        double P = (a+b+h+Math.sqrt((h*h)+(s*s)));
        return P;
    }
// main method
    public static void main(String[] args) {
        Trapezium sanna = new Trapezium();
        System.out.println("Area: "+sanna.Area());
        System.out.println("Perimeter: "+sanna.Perimeter());
    }
}
