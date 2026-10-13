class NameThread extends Thread {
    public NameThread(String name) { super(name); }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running: " + getName() + " (" + i + ")");
        }
    }
}
public class Q4_TwoThreads {
    public static void main(String[] args) {
        new NameThread("Thread-A").start();
        new NameThread("Thread-B").start();
        // Observation: output order changes between runs. The JVM/OS scheduler decides which thread
        // gets the CPU and for how long (time slicing), so the order is not guaranteed.
    }
}
