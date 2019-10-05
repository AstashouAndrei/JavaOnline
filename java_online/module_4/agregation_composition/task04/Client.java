package by.java_online.module_4.agregation_composition.task04;

public class Client {

    private String name;
    private Account[] accounts;

    public Client(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void printAccountsInfo() {
        for (Account account : accounts) {
            if (!account.isBlocked()) {
                System.out.println("Account ID: " + account.getID() + ". Current amount is: " + account.getAmmount() + ". Account available.");
            } else {
                System.out.println("Account ID: " + account.getID() + ". Current amount is: " + account.getAmmount() + ". Account unavailable.");
            }
        }
    }

    public int getTotalAmount() {
        int total = 0;
        for (Account account : accounts) {
            total += account.getAmmount();
        }
        return total;
    }

    public int getTotalPositiveAmount() {
        int total = 0;
        for (Account account : accounts) {
            if (account.getAmmount() >= 0) {
                total += account.getAmmount();
            }
        }
        return total;
    }

    public int getTotalNegativeAmount() {
        int total = 0;
        for (Account account : accounts) {
            if (account.getAmmount() < 0) {
                total += account.getAmmount();
            }
        }
        return total;
    }

    public void sortByAmounts() {
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts.length; j++) {
                if (accounts[i].compareTo(accounts[j]) > 0) {
                    Account temp = accounts[j];
                    accounts[j] = accounts[i];
                    accounts[i] = temp;
                }
            }
        }
    }
}
