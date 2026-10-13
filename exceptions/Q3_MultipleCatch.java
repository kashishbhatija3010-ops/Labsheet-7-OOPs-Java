import java.util.Scanner;
class SafeDivider {
    public int divide(String s1, String s2) {
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        return a / b;
    }
}
class DivisionApp {
    private final SafeDivider divider = new SafeDivider();
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second number: ");
        String s2 = sc.nextLine();
        try {
            System.out.println("Result = " + divider.divide(s1, s2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
        sc.close();
    }
}
public class Q3_MultipleCatch {
    public static void main(String[] args) {
        new DivisionApp().run();
    }
}