import java.util.Scanner;

public class Main {
    private final String PASSWORD;

    public Main(String password) {
        this.PASSWORD = password;
    }

    public static void main(String[] args) {
        Main main = new Main("1234");
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        int numTries = 0;
        boolean accessGranted = false;


        while (numTries < 3 && !accessGranted) {

            System.out.println("Enter password to access bank information: ");
            String input = scanner.nextLine();

            if (input.equals(PASSWORD)) {
                System.out.println("Lösenord godkänt!");


                Bank bank = new Bank();

                //Bestämmer kundernas egenskaper
                Customer customer1 = new Customer("Alice", "19910810-6666");
                Customer customer2 = new Customer("Bob", "19960207-3234");

                //Bestämmer egenskaper för konton och kopplar dem till kund
                SavingsAccount account1 = new SavingsAccount(customer1, 1000, 1.5);
                TransactionAccount account2 = new TransactionAccount(customer1, 2000);
                SavingsAccount account3 = new SavingsAccount(customer2, 5000, 2.0);

                //Skapar kunder och konton
                bank.addCustomer(customer1);
                bank.addCustomer(customer2);

                bank.addAccount(account1);
                bank.addAccount(account2);
                bank.addAccount(account3);

                //Anropar metoden getNumberOfCustomers i bank klassen
                int numCustomers = bank.getNumberOfCustomers();

                //Skriver ut information om banken och visar insättningar och uttagningar
                System.out.println("Antalet kunder: " + numCustomers);

                System.out.println("Bankens totala omsättning: " + bank.getTotalBalance());

                System.out.println("______________________________________");

                System.out.println("Transaktioner");

                account1.withdraw(500);

                System.out.println("Bankens totala omsättning efter uttag: " + bank.getTotalBalance());

                account2.deposit(1000);

                System.out.println("Bankens totala omsättning efter insättning: " + bank.getTotalBalance());

                account3.withdraw(6000);

                System.out.println("Bankens totala omsättning efter utag: " + bank.getTotalBalance());

            } else {
                numTries++;
                System.out.println("Åtkomst nekad: Du har anget fel lösenord och har " + (3 - numTries) + "kvarstående försök");
            }
        }

        if (!accessGranted) {
            System.out.println("Åtkomst nekad: maxantalet av försök har nåtts");
        }

    }
}


