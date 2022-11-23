import java.util.Scanner;

public class Calculation {
    // instance variable
    public int num1;
    public int num2;

    // constructor
    public Calculation(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    // the add method
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    // the subtraction method
    public static int sub(int num1, int num2){
        int difference = Math.abs(num1 - num2);
        return difference;
    }
    // the multiplication method
    public static int mul(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args) {
        Scanner sanna = new Scanner(System.in);
        System.out.println("Enter first number: ");
        // first input (integer)
        int num1 = sanna.nextInt();
        System.out.println("Enter second number: ");
        // second input (integer)
        int num2 = sanna.nextInt();

        // calculating for the average, distance, max and min
        double average = (add(num1, num2)/2);
        int distance = Math.abs(sub(num1, num2));
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        // The display
        System.out.println("The sum is: "+Calculation.add(num1, num2));
        System.out.println("The difference is: "+Calculation.sub(num1, num2));
        System.out.println("The product is: "+Calculation.mul(num1, num2));
        System.out.println("The average is: "+average);
        System.out.println("The distance is: "+distance);
        System.out.println("The max is: "+max);
        System.out.println("The min is: "+min);
    }

}
