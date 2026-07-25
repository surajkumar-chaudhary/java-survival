package fundamentals.oop;

class BankAccount {

    // Private fields cannot be accessed directly from another class
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter method
    String getAccountHolder() {
        return accountHolder;
    }

    // Setter method
    void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isBlank()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Account holder name cannot be empty.");
        }
    }

    // Getter method
    double getBalance() {
        return balance;
    }

    // Controlled method for depositing money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Controlled method for withdrawing money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }

    void displayAccount() {
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Ram Sharma", 1000);

        account.displayAccount();

        System.out.println();

        account.deposit(500);
        account.withdraw(300);

        System.out.println();

        System.out.println("Holder: " + account.getAccountHolder());
        System.out.println("Current balance: $" + account.getBalance());

        System.out.println();

        account.setAccountHolder("Sita Sharma");
        account.displayAccount();
    }
}