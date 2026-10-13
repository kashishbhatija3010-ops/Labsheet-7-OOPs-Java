class NumberPrinter implements Runnable {
    private final int start, end;
    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
public class Q2_RunnableDemo {
    public static void main(String[] args) {
        new Thread(new NumberPrinter(1, 10)).start();
    }
}