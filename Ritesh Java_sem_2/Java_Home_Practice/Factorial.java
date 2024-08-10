import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No: ");
        int number = sc.nextInt();
        
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
