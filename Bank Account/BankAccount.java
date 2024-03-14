/* 
 * De Villa, Edrick L.
 * BSCS 3-3
 */
class BankAccount {
    private int accountNumber; // Unique account identifier
    private String accountName; // Account holder name
    private double balance; // Account balance

    public BankAccount(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount; // Update balance with deposited amount
        System.out.println("Amount deposited: " + amount);
        displayBalance(); // Display updated balance
    }

    public void withdraw(double amount) {
        if (balance >= amount) { // Check if sufficient balance exists
            balance -= amount; // Update balance with withdrawn amount
            System.out.println("Amount withdrawn: " + amount);
            displayBalance(); // Display updated balance
        } else {
            System.out.println("\nUh oh! You have insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Your balance: " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance; // Set new balance value
    }
}

class SavingsAccount extends BankAccount {
    // Minimum deposit required
    private static final double REQUIRED_INITIAL_DEPOSIT = 3000;
    // Minimum balance to avoid closure
    private static final double MIN_BALANCE = 100;

    // Savings account constructor
    public SavingsAccount(int accountNumber, String accountName) {
        super(accountNumber, accountName, REQUIRED_INITIAL_DEPOSIT);
    }

    // Overridden withdraw method
    @Override
    public void withdraw(double amount) {
        // Check if withdrawal will cause closure
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("\nSavings account closed due to low balance.");
            setBalance(0);
        } else {
            // Call parent withdraw method
            super.withdraw(amount);
        }
    }
}

class CheckingAccount extends BankAccount {
    // Checking account specifics
    private static final double REQUIRED_INITIAL_DEPOSIT = 5000;

    // Checking account constructor
    public CheckingAccount(int accountNumber, String accountName) {
        super(accountNumber, accountName, REQUIRED_INITIAL_DEPOSIT);
    }
}

