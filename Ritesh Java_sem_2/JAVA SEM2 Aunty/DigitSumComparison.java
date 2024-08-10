import java.util.Scanner;

public class DigitSumComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int sumM = calculateDigitSum(M);
        int sumN = calculateDigitSum(N);

        if (sumM > sumN) {
            System.out.println("Sum of digits of M is larger: " + sumM);
        } else if (sumN > sumM) {
            System.out.println("Sum of digits of N is larger: " + sumN);
        } else {
            System.out.println("-1");
        }

        scanner.close();
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
