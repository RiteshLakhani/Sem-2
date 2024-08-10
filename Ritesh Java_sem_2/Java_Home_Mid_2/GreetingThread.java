public class GreetingThread implements Runnable {

    private String message;
    private int interval;

    public GreetingThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(message);
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        GreetingThread morningThread = new GreetingThread("Good Morning", 1000);
        GreetingThread afternoonThread = new GreetingThread("Good Afternoon", 3000);
        
        new Thread(morningThread).start();
        new Thread(afternoonThread).start();
    }
}
