public class BusinessLoan extends Loan 
{
    public BusinessLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterestRate) 
    {
        super(loanNumber, customerLastName, loanAmount, term);
        setInterestRate(primeInterestRate + 0.01); // adds 1% to the current prime interest rate for business loans
    }

    @Override
    public void setInterestRate(double rate) 
    {
        interestRate = rate;
    }
}

