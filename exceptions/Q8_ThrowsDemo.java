import java.util.Scanner;
class NumberReader {
    private final Scanner sc = new Scanner(System.in);
    public int readNumber() throws NumberFormatException {
        System.out.print("Enter a number: ");
        return Integer.parseInt(sc.nextLine());
    }
}
class NumberApp {
    private final NumberReader reader = new NumberReader();
    public void run() {
        try {
            int n = reader.readNumber();
            System.out.println("You entered: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + e.getMessage());
        }
    }
}
public class Q8_ThrowsDemo {
    public static void main(String[] args) {
        new NumberApp().run();
    }
}
