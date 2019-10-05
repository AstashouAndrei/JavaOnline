package by.java_online.module_4.simple_classes.task08;

import java.util.Arrays;
import java.util.Comparator;

public class Customer {

    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String fullName;
    private String addres;
    private int cardNumber;
    private int account;

    public Customer(int id, String lastName, String firstName, String middleName, String addres, int cardNumber, int account) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.addres = addres;
        this.cardNumber = cardNumber;
        this.account = account;
        this.fullName = lastName + " " + firstName + " " + middleName;
    }

    public Customer(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + middleName;
    }

    public static void sortAlphabetically(Customer[] customers) {
        Arrays.sort(customers, new Customer.CustomerLastNameComparator().
                thenComparing(new Customer.CustomerFirstNameComparator().
                        thenComparing(new Customer.CustomerMiddleNameComparator())));
    }

    public void printCustomerFromInt(int startWith, int endWith) {
        if (this.cardNumber > startWith && this.cardNumber < endWith) {
            System.out.println(toString());
        }
    }

    public String toString() {
        return fullName + ", ID: " + id + ". Address: " + addres;
    }

    static class CustomerLastNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.lastName.compareTo(o2.lastName);
        }
    }

    static class CustomerFirstNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.firstName.compareTo(o2.firstName);
        }
    }

    static class CustomerMiddleNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.middleName.compareTo(o2.middleName);
        }
    }


}
