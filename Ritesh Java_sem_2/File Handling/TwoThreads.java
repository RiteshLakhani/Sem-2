public class TwoThreads {
    public static void main(String[] args) {
        // Create and start the first thread
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        thread1.start();

        // Create and start the second thread
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + ": " + i);

                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
