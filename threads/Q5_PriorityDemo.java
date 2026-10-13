class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }
    @Override
    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
    }
}
public class Q5_PriorityDemo {
    public static void main(String[] args) {
        PriorityThread low = new PriorityThread("Low-Thread", Thread.MIN_PRIORITY);
        PriorityThread norm = new PriorityThread("Normal-Thread", Thread.NORM_PRIORITY);
        PriorityThread high = new PriorityThread("High-Thread", Thread.MAX_PRIORITY);
        low.start();
        norm.start();
        high.start();
        // Priority is only a hint to the scheduler; higher priority threads are MORE LIKELY
        // (not guaranteed) to run first.
    }
}
