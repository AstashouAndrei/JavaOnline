package by.java_online.module_4.simple_classes.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Solution {

    public static void main(String[] args) {

        Airline[] airlines = {
                new Airline("Moscow", 205, "Boeing", LocalTime.of(10, 45), DayOfWeek.MONDAY),
                new Airline("Beijing", 1706, "Boeing", LocalTime.of(16, 39), DayOfWeek.FRIDAY),
                new Airline("Bangkok", 325, "Airbus", LocalTime.of(11, 10), DayOfWeek.TUESDAY),
                new Airline("Tokyo", 757, "Boeing", LocalTime.of(0, 42), DayOfWeek.SUNDAY),
                new Airline("Minsk", 869, "Airbus", LocalTime.of(23, 17), DayOfWeek.TUESDAY),
                new Airline("Paris", 1562, "Boeing", LocalTime.of(12, 55), DayOfWeek.WEDNESDAY),
                new Airline("Berlin", 1963, "Boeing", LocalTime.of(7, 48), DayOfWeek.THURSDAY),
                new Airline("Frankfurt", 3624, "Airbus", LocalTime.of(4, 24), DayOfWeek.MONDAY),
                new Airline("Madrid", 1874, "Boeing", LocalTime.of(18, 30), DayOfWeek.WEDNESDAY),
                new Airline("London", 209, "Boeing", LocalTime.of(10, 10), DayOfWeek.FRIDAY),
                new Airline("Deli", 5687, "Airbus", LocalTime.of(14, 5), DayOfWeek.SATURDAY),
                new Airline("Milan", 3789, "Boeing", LocalTime.of(16, 37), DayOfWeek.MONDAY),
                new Airline("New York", 8659, "Airbus", LocalTime.of(23, 20), DayOfWeek.THURSDAY),
                new Airline("Ottawa", 415, "Boeing", LocalTime.of(19, 45), DayOfWeek.SUNDAY),
        };

//        Arrays.sort(airlines);
//
//        for (Airline airline : airlines) {
//            System.out.println(airline);
//        }
//        Airline.getFlightByDestination(airlines);
//        Airline.getDailyFlights(airlines);
        Airline.getDailyFlightsLaterThan(airlines);
    }
}
