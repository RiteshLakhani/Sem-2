import java.util.Scanner;

class ThreadExtend1 extends Thread {
    int odd;

    ThreadExtend1(int odd) {
        this.odd = odd;
    }

    public void run() {
        try {
            printOddNumbers();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printOddNumbers() throws InterruptedException {
        for (int i = 0; i <= odd; i++) {
            if (odd % 2 != 0) {
                System.out.print(i);
                Thread.sleep(1000);
            } else {
                break;
            }
        }
    }
}

class ThreadExtend2 extends Thread {
    int even;

    ThreadExtend2(int even) {
        this.even = even;
    }

    public void run() {
        try {
            printEvenNumbers();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printEvenNumbers() throws InterruptedException {
        for (int i = 0; i <= even; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                Thread.sleep(2000);
            } else {
                break;
            }
        }
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of term: ");
        int a = sc.nextInt();

        

        ThreadExtend1 thread1 = new ThreadExtend1(a);
        ThreadExtend2 thread2 = new ThreadExtend2(a);

        thread1.start();
        try {
            thread1.join(); // Wait for thread1 to complete
        } catch (Exception e) {
            e.printStackTrace();
        }

        thread2.start();

        try {
            thread2.join(); // Wait for thread2 to complete
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
