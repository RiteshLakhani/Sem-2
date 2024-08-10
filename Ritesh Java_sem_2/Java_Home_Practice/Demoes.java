import java.util.Scanner;

public class Demoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter distance: ");
        double distance = scanner.nextDouble();
        
        PythagoreanTheorem theorem = new PythagoreanTheorem(height, distance);
        System.out.println("Angle: " + theorem.getAngle());
        System.out.println("Hypotenuse: " + theorem.getHypotenuse());
    }
}

public class PythagoreanTheorem {
    private double height;
    private double distance;
    
    public PythagoreanTheorem(double height, double distance) {
        this.height = height;
        this.distance = distance;
    }
    
    public double getAngle() {
        return Math.atan2(height, distance);
    }
    
    public double getHypotenuse() {
        return Math.sqrt(height * height + distance * distance);
    }
}