package by.java_online.module_4.simple_classes.task05;

public class Solution {

    public static void main(String[] args) {

        Counter counter = new Counter(20, 30);
        System.out.println(counter.getValue());

        counter.increment();
        System.out.println(counter.getValue());

        counter.decrement();
        counter.decrement();
        System.out.println(counter.getValue());

        Counter defaultValues = new Counter();
        System.out.println(defaultValues.getValue());
        System.out.println(defaultValues.getStartRange());
        System.out.println(defaultValues.getEndRange());
    }
}
