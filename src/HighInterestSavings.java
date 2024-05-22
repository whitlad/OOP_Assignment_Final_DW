public class HighInterestSavings extends Account
{
    public HighInterestSavings(Customer aCustomer)
    {
        super(aCustomer);
    }

    @Override   /// check out the savings accounts
    public void addBalance (int numBalance)
    {
        int interestRate = numBalance / 100 * 20; //20 percent calculation
        super.addBalance(numBalance + interestRate); //adds interest rate to balance of account
    }
}
