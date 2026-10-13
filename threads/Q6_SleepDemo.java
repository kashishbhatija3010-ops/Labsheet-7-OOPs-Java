class SleeperTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Sleeper: going to sleep for 2 seconds...");
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        System.out.println("Sleeper: woke up!");
    }
}
class WorkerTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Worker: continuing execution " + i);
        }
    }
}
public class Q6_SleepDemo {
    public static void main(String[] args) {
        new Thread(new SleeperTask()).start();
        new Thread(new WorkerTask()).start();
        // Explanation: sleep() pauses only the calling thread (TIMED_WAITING) and does not release
        // locks; other threads continue to run normally.
    }
}
