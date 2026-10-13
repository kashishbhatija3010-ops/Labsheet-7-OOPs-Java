package demo;
public class AccessDemo {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;
    public void publicMethod() { System.out.println("public method"); }
    protected void protectedMethod() { System.out.println("protected method"); }
    void defaultMethod() { System.out.println("default method"); }
    private void privateMethod() { System.out.println("private method"); }
}
