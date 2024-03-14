import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the current prime interest rate from the user
        System.out.print("Enter the current prime interest rate: ");
        double primeInterestRate = scanner.nextDouble();

        // array to store loan objects
        Loan[] loans = new Loan[5];

        // for loop to gather information for each loan
        for (int i = 0; i < loans.length; i++) {
            System.out.println("\nEnter details for Loan " + (i + 1) + ":");
            
            // prompt user for loan type (B for business, P for personal)
            System.out.print("Enter loan type (B for business, P for personal): ");
            char loanType = scanner.next().charAt(0);

            System.out.print("Enter customer last name: ");
            // consume the newline character left in the buffer
            scanner.nextLine();
            String lastName = scanner.nextLine();
            
            // prompt user for loan amount
            System.out.print("Enter loan amount: Php ");
            double loanAmount = scanner.nextDouble();

            // prompt user for loan term (1 for short-term, 3 for medium-term, 5 for long-term)
            System.out.print("Enter loan term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int term = scanner.nextInt();

            // create a loan object based on the user input
            if (loanType == 'B' || loanType == 'b') {
                loans[i] = new BusinessLoan(i + 1, lastName, loanAmount, term, primeInterestRate);
            } else if (loanType == 'P' || loanType == 'p') {
                loans[i] = new PersonalLoan(i + 1, lastName, loanAmount, term, primeInterestRate);
            } else {
                // Default to Personal Loan if an invalid loan type is entered
                System.out.println("Invalid loan type. Defaulting to Personal Loan.");
                loans[i] = new PersonalLoan(i + 1, lastName, loanAmount, term, primeInterestRate);
            }
        }

        // close the scanner
        scanner.close();

        // display information for all created loans
        System.out.println("\nAll Loans:");
        for (Loan loan : loans) {
            System.out.println(loan);
            System.out.println("----------------------------------");
        }
    }
}
