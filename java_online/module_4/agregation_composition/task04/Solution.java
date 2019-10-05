package by.java_online.module_4.agregation_composition.task04;

public class Solution {

    public static void main(String[] args) {

        Account firstAccount = new Account(24125, 1000);
        Account secondAccount = new Account(24127, -800);
        Account thirdAccount = new Account(24129, 200);
        Account fourthAccount = new Account(24148, 500);

        Account[] accounts = {firstAccount, secondAccount, thirdAccount, fourthAccount};

        Client client = new Client("William Stanley Milligan", accounts);


        System.out.println("Total amount is: " + client.getTotalAmount());
        System.out.println("Total positive amount is: " + client.getTotalPositiveAmount());
        System.out.println("Total negative amount is: " + client.getTotalNegativeAmount());
        secondAccount.lockAccount();
        client.sortByAmounts();
        client.printAccountsInfo();
    }
}
