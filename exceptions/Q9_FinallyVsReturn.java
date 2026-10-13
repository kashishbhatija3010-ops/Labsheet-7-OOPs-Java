class ReturnTester {
    public int test() {
        try {
            System.out.println("Inside try block");
            return 10;
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
public class Q9_FinallyVsReturn {
    public static void main(String[] args) {
        ReturnTester tester = new ReturnTester();
        int value = tester.test();
        System.out.println("Returned value: " + value);
        // Order: try -> finally -> value printed in main.
        // Explanation: the return value (10) is evaluated in try, but the method does not actually
        // return until finally completes. So finally runs BEFORE control goes back to the caller.
    }
}
