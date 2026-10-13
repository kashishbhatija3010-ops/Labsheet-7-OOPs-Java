class AgeValidator {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above. Given: " + age);
        }
        System.out.println("Access granted. Age: " + age);
    }
}
public class Q6_ThrowDemo {
    public static void main(String[] args) {
        try {
            AgeValidator.checkAge(20);
            AgeValidator.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}