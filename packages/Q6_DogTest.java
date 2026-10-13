import animals.Dog;
public class Q6_DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();                  // (a) using import
        d1.bark();
        animals.Dog d2 = new animals.Dog();  // (b) fully qualified name
        d2.bark();
        // Comparison: import keeps the code short and readable. A fully qualified name needs no import
        // and is useful when two packages contain classes with the same name.
    }
}