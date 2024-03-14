import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.println("Welcome! Please enter the following:");
        System.out.print("Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Account Name: ");
        String accountName = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountName, 0);

        int accountType;
        //making sure that the users will input either 1 or 2 only
        while (true)
        {
            System.out.print("Type of Account (1=Savings, 2=Checking): ");
            accountType = scanner.nextInt();
            if (accountType == 1 || accountType == 2) 
            {
                break;
            }
            
            else 
            {
                System.out.println("\nInvalid input. Please try again.\n");
            }
        }
        
        if (accountType == 1) 
            {
                account = new SavingsAccount(accountNumber, accountName);
            } 

            else
            {
                account = new CheckingAccount(accountNumber, accountName);
            }

        // Main menu loop
        int choice;
        do 
        {
            // Display account information
            System.out.println("\nAccount Number: " + account.getAccountNumber());
            System.out.println("Account Name: " + account.getAccountName());
            System.out.println("Type of Account: " + (account instanceof SavingsAccount ? "Savings" : "Checking"));
            System.out.println("Initial Balance: " + account.getBalance());

            // Get user choice
            System.out.println("\nEnter your choice (1=Deposit, 2=Withdraw, 3=Exit, 4=Change Account Type): ");
            choice = scanner.nextInt();

            // Perform actions based on user choice
            switch (choice) 
            {
                case 1:
                    System.out.print("\nEnter amount to be deposited: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("\nEnter amount to be withdrawn: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.print("\nType of Account (1=Savings, 2=Checking): ");
                    int newAccountType = scanner.nextInt();
                    if (newAccountType == 1 && !(account instanceof SavingsAccount)) {
                        account = new SavingsAccount(account.getAccountNumber(), account.getAccountName());
                    } else if (newAccountType == 2 && !(account instanceof CheckingAccount)) {
                        account = new CheckingAccount(account.getAccountNumber(), account.getAccountName());
                    }
                    break;
                default:
                    break;
            }
        } 
        
        while (choice != 3);

        System.out.println("\nThank you. Have a nice day!\n");
    }
}

