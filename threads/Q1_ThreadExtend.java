class MessageThread extends Thread {
    private final String message;
    private final int times;
    public MessageThread(String message, int times) {
        this.message = message;
        this.times = times;
    }
    @Override
    public void run() {
        for (int i = 1; i <= times; i++) {
            System.out.println(message + " (" + i + ") from " + getName());
        }
    }
}
public class Q1_ThreadExtend {
    public static void main(String[] args) {
        new MessageThread("Hello from thread", 5).start();
    }
}