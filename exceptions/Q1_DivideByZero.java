import java.util.Scanner;
class Calculator {
    public int divide(int a, int b) { return a / b; }
}
class DivisionTask {
    private final Calculator calculator = new Calculator();
    private final Scanner sc = new Scanner(System.in);
    public void execute() {
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("Result = " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero (" + e.getMessage() + ")");
        } finally {
            System.out.println("Finally block executed");
            sc.close();
        }
    }
}
public class Q1_DivideByZero {
    public static void main(String[] args) {
        new DivisionTask().execute();
    }
}