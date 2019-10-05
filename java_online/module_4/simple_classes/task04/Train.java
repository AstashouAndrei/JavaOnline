package by.java_online.module_4.simple_classes.task04;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Scanner;

public class Train implements Comparable<Train> {

    private String destination;
    private int trainNumber;
    private LocalTime departureTime;

    public Train(String destination, int trainNumber, LocalTime departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    @Override
    public int compareTo(Train train) {
        return this.trainNumber - train.trainNumber;
    }

    public static void printByRequest(Train[] trains) {

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int trainNumber = scanner.nextInt();

        for (Train train : trains) {
            if (train.trainNumber == trainNumber) {
                System.out.println(train);
            }
        }
    }

    static class TrainDestinationComparator implements Comparator<Train> {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.destination.compareTo(o2.destination);
        }
    }

    static class TrainDepartureComparator implements Comparator<Train> {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.departureTime.compareTo(o2.departureTime);
        }
    }

    public String toString() {
        return "Train №" + trainNumber + " to " + destination + ". Departure time: " + departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
