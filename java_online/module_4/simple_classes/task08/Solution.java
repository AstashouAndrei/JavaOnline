package by.java_online.module_4.simple_classes.task08;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        Customer[] customers = {
                new Customer(14503, "Novikov", "Alexandr", "Alexandrovich", "Sviridova 42 / 12", 536126, 54785),
                new Customer(18604, "Dubrov", "Igor", "Ivanovich", "Efremova 17 / 37", 834967, 14408),
                new Customer(10867, "Saponchik", "Victor", "Vladimirovich", "Sovetskaya  120 / 2", 126867, 68647),
                new Customer(9687, "Konopatskiy", "Alexandr", "Nikolaevich", "Kosmonavtov 76 / 50", 334589, 64684),
                new Customer(6987, "Lis", "Dmitry", "Andreevich", "Rechitskaya 18 / 162", 775577, 23234),

        };

        Customer.sortAlphabetically(customers);

        for (Customer customer : customers) {
            customer.printCustomerFromInt(300000, 800000);
        }
    }
}
