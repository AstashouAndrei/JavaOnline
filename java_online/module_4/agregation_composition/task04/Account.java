package by.java_online.module_4.agregation_composition.task04;

public class Account implements Comparable<Account> {

    private int ID;
    private int ammount;
    private boolean isBlocked;

    public Account(int ID, int ammount) {
        this.ID = ID;
        this.ammount = ammount;
    }

    public void lockAccount() {
        isBlocked = true;
    }

    public void unlockAccount() {
        isBlocked = false;
    }

    public void creditMoney(int money) {
        if (!isBlocked) {
            ammount += money;
        } else {
            System.out.println("Sorry, account " + ID + " is blocked.");
        }
    }

    public void withdrawMoney(int money) {
        if (!isBlocked) {
            ammount -= money;
        } else {
            System.out.println("Sorry, account " + ID + " is blocked.");
        }
    }

    @Override
    public int compareTo(Account o) {
        if (this.getAmmount() > o.getAmmount()) {
            return 1;
        }
        else if (this.getAmmount() < o.getAmmount()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
