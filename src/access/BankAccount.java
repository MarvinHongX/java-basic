package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this(0);
    }
    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            this.balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && (balance - amount) >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
