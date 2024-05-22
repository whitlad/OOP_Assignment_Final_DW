public class SavingsAccount extends Account
{
    public SavingsAccount(Customer aCustomer)
    {
        super(aCustomer);
    }

    @Override   /// check out the savings accounts
    public void addBalance(int numBalance)
    {
        int interestRate = numBalance / 100 * 10; //10 percent calculation
        super.addBalance(numBalance + interestRate);
    }
}
