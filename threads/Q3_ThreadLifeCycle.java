class LockedTask implements Runnable {
    private final Object lock;
    public LockedTask(Object lock) { this.lock = lock; }
    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("Thread is RUNNING (inside synchronized block)");
            try { Thread.sleep(500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}
class LifeCycleObserver {
    private final Object lock = new Object();
    private final Thread thread = new Thread(new LockedTask(lock));
    public void observe() throws InterruptedException {
        System.out.println("1. After creation        : " + thread.getState());   // NEW
        synchronized (lock) {
            thread.start();
            System.out.println("2. After start()         : " + thread.getState());   // RUNNABLE
            Thread.sleep(200);
            System.out.println("3. Waiting for lock      : " + thread.getState());   // BLOCKED
        }
        Thread.sleep(200);
        System.out.println("4. Sleeping inside lock  : " + thread.getState());   // TIMED_WAITING
        thread.join();
        System.out.println("5. After completion      : " + thread.getState());   // TERMINATED
    }
}
public class Q3_ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        new LifeCycleObserver().observe();
    }
}