package by.java_online.module_4.simple_classes.task04;

import java.time.LocalTime;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        Train[] trains = {
                new Train("Minsk", 31, LocalTime.of(21, 45)),
                new Train("Moscow", 86, LocalTime.of(23, 3)),
                new Train("Warsaw", 99, LocalTime.of(18, 18)),
                new Train("Moscow", 19, LocalTime.of(2, 47)),
                new Train("Kiev", 29, LocalTime.of(10, 32)),
                new Train("Kiev", 4, LocalTime.of(0, 17)),
                new Train("Warsaw", 65, LocalTime.of(16, 42)),
                new Train("Moscow", 77, LocalTime.of(18, 42)),

        };

        Train.printByRequest(trains);

        System.out.println("After sorting by train number");

        Arrays.sort(trains);

        for (Train train : trains) {
            System.out.println(train);
        }


        System.out.println("Sorting by destination and departure time");

        Arrays.sort(trains, new Train.TrainDestinationComparator().
                thenComparing(new Train.TrainDepartureComparator()));

        for (Train train : trains) {
            System.out.println(train);
        }
    }
}
