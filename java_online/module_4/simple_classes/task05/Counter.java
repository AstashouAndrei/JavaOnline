package by.java_online.module_4.simple_classes.task05;

public class Counter {

    private int startRange;
    private int endRange;
    private int value;

    public Counter() {

    }

    public Counter(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
        this.value = (startRange + endRange) / 2;
    }

    public void increment() {
        if (value > startRange && value < endRange) {
            value++;
        }
    }

    public void decrement() {
        if (value > startRange && value < endRange) {
            value--;
        }
    }

    public int getStartRange() {
        return startRange;
    }

    public void setStartRange(int startRange) {
        this.startRange = startRange;
    }

    public int getEndRange() {
        return endRange;
    }

    public void setEndRange(int endRange) {
        this.endRange = endRange;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

