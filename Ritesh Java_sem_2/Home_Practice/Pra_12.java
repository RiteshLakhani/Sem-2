import java.util.Scanner;

public class Pra_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize variables
        double total = 0;
        double max_value = Double.NEGATIVE_INFINITY;
        double min_value = Double.POSITIVE_INFINITY;

        // Input n numbers and update variables
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            total += num;
            if (num > max_value) {
                max_value = num;
            }
            if (num < min_value) {
                min_value = num;
            }
        }

        // Calculate average
        double avg = total / n;

        // Print the results
        System.out.println("Maximum value: " + max_value);
        System.out.println("Minimum value: " + min_value);
        System.out.println("Average value: " + avg);

        scanner.close();
    }
}
