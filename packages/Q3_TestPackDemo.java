import testpack.PublicClass;
public class Q3_TestPackDemo {
    public static void main(String[] args) {
        PublicClass p = new PublicClass();
        p.show();
        // Uncomment the lines below to see the error:
        // testpack.DefaultClass d = new testpack.DefaultClass();
        // Error: DefaultClass is not public in testpack; cannot be accessed from outside the package
    }
}
