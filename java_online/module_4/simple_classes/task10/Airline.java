package by.java_online.module_4.simple_classes.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Scanner;

public class Airline implements Comparable<Airline> {

    private String desination;
    private int flightNumber;
    private String plane;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(String desination, int flightNumber, String plane, LocalTime departureTime, DayOfWeek dayOfWeek) {
        this.desination = desination;
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public static void getFlightByDestination(Airline[] airlines) {

        System.out.print("Please enter required destination: ");

        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        for (Airline airline : airlines) {
            if (destination.equals(airline.desination)) {
                System.out.println(airline);
            }
        }
    }

    public static void getDailyFlights(Airline[] airlines) {

        System.out.print("Please enter day of week: ");

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        for (Airline airline : airlines) {
            if (day.toUpperCase().equals(airline.dayOfWeek.toString())) {
                System.out.println(airline);
            }
        }
    }

    public static void getDailyFlightsLaterThan(Airline[] airlines) {

        System.out.print("Please enter day of week: ");

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        int time;
        do {
            System.out.print("Please enter time: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error. Time should be positive integer, less than 24 ");
                scanner.next();
            }
            time = scanner.nextInt();
        } while (time <= 0 && time < 24);

        for (Airline airline : airlines) {
            if (day.toUpperCase().equals(airline.dayOfWeek.toString()) &&
            airline.departureTime.getHour() > time) {
                System.out.println(airline);
            }
        }
    }

    @Override
    public String toString() {
        return "Flight #" + flightNumber + " (" + plane + "). Destination: "
                + desination + ". Departure: " + dayOfWeek + ", " + departureTime;
    }

    @Override
    public int compareTo(Airline o) {
        if (this.departureTime.getHour() - o.departureTime.getHour() < 0) {
            return -1;
        } else if (this.departureTime.getHour() - o.departureTime.getHour() > 0) {
            return 1;
        } else {
            return this.departureTime.getMinute() - o.departureTime.getMinute();
        }

    }
}
