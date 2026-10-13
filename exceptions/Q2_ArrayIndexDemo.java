import java.util.Scanner;
class ArrayHolder {
    private final int[] data;
    public ArrayHolder(int[] data) { this.data = data; }
    public int getValue(int index) { return data[index]; }
    public int size() { return data.length; }
}
class ArrayAccessTask {
    private final ArrayHolder holder;
    public ArrayAccessTask(ArrayHolder holder) { this.holder = holder; }
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index (0-" + (holder.size() - 1) + "): ");
        int index = sc.nextInt();
        try {
            System.out.println("Value at index " + index + " = " + holder.getValue(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Array has only " + holder.size() + " elements. " + e.getMessage());
        }
        sc.close();
    }
}
public class Q2_ArrayIndexDemo {
    public static void main(String[] args) {
        ArrayHolder holder = new ArrayHolder(new int[]{10, 20, 30, 40, 50});
        new ArrayAccessTask(holder).execute();
    }
}