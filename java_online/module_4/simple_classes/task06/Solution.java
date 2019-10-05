package by.java_online.module_4.simple_classes.task06;

public class Solution {

    public static void main(String[] args) {

        Time time = new Time(16, 48, 13);
        System.out.println(time);

        time.changeSeconds(12345); // + 3h 25m
        System.out.println(time);

        time.changeMinutes(-654); // - 10h 54m
        System.out.println(time);

        time.changeHours(14);    //+14h
        System.out.println(time);
    }
}
