import java.util.Scanner;

public class TusharsMonthlyIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 12 space-separated integers representing standard-wise fees:");
        int[] fees = new int[12];
        for (int i = 0; i < 12; i++) {
            fees[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of students:");
        int N = scanner.nextInt();

        System.out.println("Enter " + N + " space-separated integers representing the standard of each student:");
        int[] students = new int[N];
        for (int i = 0; i < N; i++) {
            students[i] = scanner.nextInt();
        }

        double income = calculateMonthlyIncome(fees, students) / 12.0;
        System.out.println("Tushar's Monthly Income (per standard): " + income);

        scanner.close();
    }

    public static double calculateMonthlyIncome(int[] fees, int[] students) {
        if (fees.length != 12) {
            return -1; // Invalid input: The fees array should contain 12 elements.
        }

        int income = 0;
        for (int student : students) {
            if (student < 0 || student > 11) {
                return -1; // Invalid input: Student standard should be between 0 and 11.
            }
            income += fees[student];
        }

        return (double) income;
    }
}
