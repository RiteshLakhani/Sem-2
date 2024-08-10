import java.util.Scanner;

public class Mid2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            try {
                if (num < 0) {
                    throw new IllegalArgumentException("Negative number found: " + num);
                }

                if (num % 10 == 0) {
                    throw new IllegalArgumentException("Number divisible by 10 found: " + num);
                }

                if (num > 1000 && num < 2000) {
                    throw new IllegalArgumentException("Number between 1000 and 2000 found: " + num);
                }

                if (num > 7000) {
                    throw new IllegalArgumentException("Number greater than 7000 found: " + num);
                }

                sum += num;
            } catch (IllegalArgumentException e) {
                System.out.println("Exception occurred: " + e.getMessage());
                System.out.println("Skipping the number...");
            }
        }

        System.out.println("Final sum: " + sum);

        scanner.close();
    }
}
