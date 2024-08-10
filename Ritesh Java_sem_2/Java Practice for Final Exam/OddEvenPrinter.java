public class OddEvenPrinter {
    private static int number = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
            while (number <= 10) {
                synchronized (lock) {
                    if (number % 2 != 0) {  // odd check
                        System.out.println("Odd: " + number);
                        number++;
                    }
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (number <= 10) {
                synchronized (lock) {
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
