class InsufficientFundsException extends Exception {
    private final double shortfall;
    public InsufficientFundsException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }
    public double getShortfall() { return shortfall; }
}
class BankAccount {
    private double balance;
    public BankAccount(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Available: " + balance, amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
    }
}
public class Q10_BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);
        try {
            acc.withdraw(2000);
            acc.withdraw(10000);
        } catch (InsufficientFundsException e) {
            System.out.println("User-defined exception: " + e.getMessage() + " (short by " + e.getShortfall() + ")");
        } catch (IllegalArgumentException e) {
            System.out.println("Built-in exception: " + e.getMessage());
        }
        try {
            acc.withdraw(-100);
        } catch (InsufficientFundsException e) {
            System.out.println("User-defined exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Built-in exception: " + e.getMessage());
        }
    }
}
