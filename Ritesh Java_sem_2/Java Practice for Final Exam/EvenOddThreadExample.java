import java.util.Scanner;

class EvenThread extends Thread {
    private int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddThread extends Thread {
    private int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

public class EvenOddThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        EvenThread evenThread = new EvenThread(limit);
        OddThread oddThread = new OddThread(limit);

        evenThread.start();
        oddThread.start();
    }
}
