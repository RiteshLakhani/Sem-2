import java.util.*;

public class vscode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int a = sc.nextInt();

        boolean isPrime = true;

        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not prime");
        }

        System.out.println("Hello World");
    }
}
