class Counter {
    protected int count = 0;
    public void increment() { count++; }
    public int getCount() { return count; }
}
class IncrementTask implements Runnable {
    private final Counter counter;
    private final int times;
    public IncrementTask(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }
    @Override
    public void run() {
        for (int i = 0; i < times; i++) counter.increment();
    }
}
public class Q8_UnsyncCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new IncrementTask(counter, 100000));
        Thread t2 = new Thread(new IncrementTask(counter, 100000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Expected: 200000");
        System.out.println("Actual  : " + counter.getCount() + "  (usually less due to race condition)");
    }
}
