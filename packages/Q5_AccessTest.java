import demo.AccessDemo;
class Child extends AccessDemo {
    void show() {
        System.out.println("Protected variable via inheritance: " + protectedVar);
        protectedMethod();
    }
}
public class Q5_AccessTest {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("Public variable: " + obj.publicVar);
        obj.publicMethod();
        // obj.protectedVar;   // ERROR: protected is accessible outside the package only via inheritance
        // obj.defaultVar;     // ERROR: default is accessible only inside the same package
        // obj.privateVar;     // ERROR: private is accessible only inside the same class
        new Child().show();
    }
}
