import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    private HashMap<String, Customer> customersMap = new HashMap<>();

    private HashMap<String, String> customerSSNMap = new HashMap<>();


    public Bank() {
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }



    public void addCustomer(Customer customer) {
        if (customerSSNMap.containsKey(customer.getSSN())) {
            System.out.println("Customer with SSN " + customer.getSSN() + " already exists.");
            return;
        }

        customers.add(customer);
        customersMap.put(customer.getSSN(), customer);
        customerSSNMap.put(customer.getSSN(), "");
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public double getTotalBalance() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }

    public boolean hasCustomer(Customer customer) {
        return customers.contains(customer);
    }




}


