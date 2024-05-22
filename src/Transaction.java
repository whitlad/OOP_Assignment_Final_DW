import java.time.LocalDateTime;
public class Transaction {
    private static int NEXT_TRANSACTION_ID = 1;
    private int id;
    private int amount;
    private LocalDateTime dateTime;
    private TransactionType type;
    public Transaction(TransactionType aType, int numAmount)
    {
        this.type = aType;
        this.amount = numAmount;
        this.dateTime = LocalDateTime.now();  //creates the time and date for now
        this.id=NEXT_TRANSACTION_ID;
        NEXT_TRANSACTION_ID++;
    }
    public int getId()
    {
        return this.id;
    }
    public int getAmount()
    {
        return this.amount;
    }
    public LocalDateTime getDateTime()
    {
        return this.dateTime;
    }
    public TransactionType getType()
    {
        return this.type;
    }
    public void showDetails()
    {
        System.out.println(this.type.toString() + "\t" + this.amount+ "\t" + this.dateTime.toString() + "\t" + id);
    }
}
 