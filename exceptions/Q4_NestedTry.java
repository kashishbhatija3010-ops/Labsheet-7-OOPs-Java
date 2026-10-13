import java.util.Scanner;
class DataProcessor {
    private final int[] numbers = {1, 2, 3, 4, 5};
    public int divide(int a, int b) { return a / b; }
    public int getElement(int index) { return numbers[index]; }
}
class NestedTryTask {
    private final DataProcessor processor = new DataProcessor();
    public void execute() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers to divide: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Division = " + processor.divide(a, b));
            try {
                System.out.print("Enter array index: ");
                int index = sc.nextInt();
                System.out.println("Array element = " + processor.getElement(index));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero");
        }
        sc.close();
    }
}
public class Q4_NestedTry {
    public static void main(String[] args) {
        new NestedTryTask().execute();
    }
}

