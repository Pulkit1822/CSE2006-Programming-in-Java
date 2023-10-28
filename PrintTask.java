public class PrintTask implements Runnable {
    private int threadNumber;
    private int sleepTime;

    public PrintTask(int threadNumber, int sleepTime) {
        this.threadNumber = threadNumber;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("Thread %d: %d%n", threadNumber, i);
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintTask(1, 1000)); // Sleep for 1 second between prints
        Thread thread2 = new Thread(new PrintTask(2, 1500)); // Sleep for 1.5 seconds between prints
        Thread thread3 = new Thread(new PrintTask(3, 2000)); // Sleep for 2 seconds between prints

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
