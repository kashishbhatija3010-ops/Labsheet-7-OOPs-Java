import java.util.ArrayList;
import java.util.Scanner;
class NameManager {
    private final ArrayList<String> names = new ArrayList<>();
    public void addName(String name) { names.add(name); }
    public ArrayList<String> getNames() { return names; }
}
class NameApp {
    private final NameManager manager = new NameManager();
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            manager.addName(sc.nextLine());
        }
        System.out.println("Names stored in ArrayList: " + manager.getNames());
        sc.close();
    }
}
public class Q8_UtilDemo {
    public static void main(String[] args) {
        new NameApp().run();
    }
}