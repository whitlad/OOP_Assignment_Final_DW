import java.util.HashSet;
public class Bank
{
    private HashSet<Account> accounts;
    private HashSet<Customer> customers;
    private HashSet<Transaction> transactions;
    public Bank()
    {
        this.accounts = new HashSet<>();
        this.customers = new HashSet<>();
        this.transactions = new HashSet<>();
    }
    public void addAccount(Account p)
    {
        this.accounts.add(p);
    }
    public void addVisitor(Customer v)
    {
        this.customers.add(v);
    }
    public void addTransaction(Transaction t)
    {
        this.transactions.add(t);
    }
    public int numberOfAccounts()
    {
        return this.accounts.size();
    }
    public int numberOfCustomers()
    {
        return this.customers.size();
    }
    public int numberOfTransactions()
    {
        return this.transactions.size();
    }
    public void listCustomers(){
        System.out.println("Customer ID\tName\tAddress\tPostcode\tPhone number\tDate of Birth");
        for (Customer c:this.customers)
        {
            c.displayDetails();
        }
    }
    public void listAccounts()
    {
        System.out.println("Customer ID\tAmount\tStatus");
        for (Account a : this.accounts)
        {
            a.displayDetails();
        }
    }
    public Customer getCustomer(int customerNumber)
    {
        Customer customer = null;
        for (Customer c : this.customers)
        {
            if(c.getNumber() == customerNumber)
            {
                customer=  c;
            }
        }
        return customer;
    }
    public Account getPass(int accountNumber)
    {
        Account account = null;
        for (Account a : this.accounts)
        {
            if(a.getNumber() == accountNumber)
            {
                account = a;
            }
        }
        return account;
    }
}

