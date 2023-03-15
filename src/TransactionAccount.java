import java.util.ArrayList;
import java.util.Date;


public class TransactionAccount extends Account{
    private Date lastTransaction;
    private ArrayList<String> transactions;

    public TransactionAccount(Customer owner, double balance) {
        super(owner, balance);
        this.lastTransaction = new Date();
        this.transactions = new ArrayList<>();
    }

    public void setLastTransaction(Date lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public void addTransaction(String transaction) {
        transactions.add(transaction);
        lastTransaction = new Date();
    }

    public Date getLastTransaction() {
        return lastTransaction;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }


}

