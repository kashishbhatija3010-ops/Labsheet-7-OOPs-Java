import java.util.Scanner;
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) { super(message); }
}
class PasswordValidator {
    private static final int MIN_LENGTH = 6;
    public void validate(String password) throws InvalidPasswordException {
        if (password.length() < MIN_LENGTH) {
            throw new InvalidPasswordException("Password must have at least " + MIN_LENGTH + " characters");
        }
        System.out.println("Password accepted");
    }
}
public class Q7_PasswordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordValidator validator = new PasswordValidator();
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();
        try {
            validator.validate(pwd);
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
        sc.close();
    }
}
