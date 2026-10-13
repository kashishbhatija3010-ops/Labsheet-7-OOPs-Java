// package labsheet7.exceptions;
class Resource {
    public void open() { System.out.println("File opened"); }
    public void operate() { System.out.println("Result: " + (10 / 0)); }
    public void close() { System.out.println("Resource closed"); }
}
class ResourceUser {
    private final Resource resource = new Resource();
    public void use() {
        try {
            resource.open();
            resource.operate();
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            resource.close();
        }
    }
}
public class Q5_FinallyDemo {
    public static void main(String[] args) {
        new ResourceUser().use();
    }
}
