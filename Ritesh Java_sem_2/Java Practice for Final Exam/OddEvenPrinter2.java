import java.util.Scanner;

public class OddEvenPrinter2 {
    private static int number = 1;
    private static int targetNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        targetNumber = scanner.nextInt();

        Thread oddThread = new Thread(() -> {
            while (number <= targetNumber) {
                synchronized (OddEvenPrinter.class) {
                    if (number % 2 != 0) {  // odd check
                        System.out.println("Odd: " + number);
                        number++;
                    }
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (number <= targetNumber) {
                synchronized (OddEvenPrinter.class) {
                    if (number % 2 == 0) {  // even check
                        System.out.println("Even: " + number);
                        number++;
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
