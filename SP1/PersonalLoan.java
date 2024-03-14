public class PersonalLoan extends Loan 
{
    public PersonalLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterestRate) 
    {
        super(loanNumber, customerLastName, loanAmount, term);
        setInterestRate(primeInterestRate + 0.02); // adds 2% to the current prime interest rate for personal loans
    }

    @Override
    public void setInterestRate(double rate) 
    {
        interestRate = rate;
    }
}
