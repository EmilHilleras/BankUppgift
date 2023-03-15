public class Account {
    private Customer owner;
    private double balance;

    public Account(Customer owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Otillräckliga likvida medel");
            return false;
        }
    }
}



