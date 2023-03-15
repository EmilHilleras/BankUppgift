import java.util.ArrayList;

public class Customer {

    private String name;
    private String ssn;
    private ArrayList<Account> accounts;



    public Customer(String name, String socialSecurityNumber) throws IllegalArgumentException {
        this.name = name;
        this.ssn = socialSecurityNumber;
        this.accounts = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getSSN() {
        return ssn;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}


