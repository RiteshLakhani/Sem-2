import java.util.Date;

class HelloWorldThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("Hello, World!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CurrentTimeThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("Current time: " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloWorldThread());
        Thread t2 = new Thread(new CurrentTimeThread());
        t1.start();
        t2.start();
    }
}
