class CountingTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread-1: " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}
class WaitingTask implements Runnable {
    private final Thread other;
    public WaitingTask(Thread other) { this.other = other; }
    @Override
    public void run() {
        System.out.println("Thread-2 started, now waiting for Thread-1 to finish...");
        try { other.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        System.out.println("Thread-2 resumed after Thread-1 completed");
    }
}
public class Q7_JoinDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CountingTask());
        Thread t2 = new Thread(new WaitingTask(t1));
        t1.start();
        t2.start();
    }
}
