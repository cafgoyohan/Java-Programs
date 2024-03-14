public abstract class Loan implements LoanConstants {
    private int loanNumber;
    private String customerLastName;
    private double loanAmount;
    protected double interestRate;
    private int term;

    //constructor method
    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;

        // ensure the loan amount is not over the maximum limit
        if (loanAmount > MAX_LOAN_AMOUNT) {
            this.loanAmount = MAX_LOAN_AMOUNT;
        } else {
            this.loanAmount = loanAmount;
        }

        // ensure term is one of the defined values
        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            this.term = SHORT_TERM; // if not, it will be considered as short-term
        }
    }

    //set interest rate
    public abstract void setInterestRate(double rate);

    //calculate the total amount owed
    public double calculateTotalAmount() {
        return loanAmount + (loanAmount * interestRate);
    }

    // print loan details
    @Override
    public String toString() {
        return "Loan Number: " + loanNumber +
                "\nCustomer Last Name: " + customerLastName +
                "\nLoan Amount: Php " + loanAmount +
                "\nInterest Rate: " + interestRate +
                "\nTerm: " + term + " year(s)" +
                "\nTotal Amount Owed: Php " + calculateTotalAmount();
    }
}

