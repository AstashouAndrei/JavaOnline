package by.java_online.module_4.simple_classes.task01;

public class Test1 {

    private int firstVar;
    private int secondVar;

    public int getSum() {
        return firstVar + secondVar;
    }

    public int getBiggest() {
        return firstVar > secondVar ? firstVar : secondVar;
    }

    @Override
    public String toString() {
        return "First variable is: " + firstVar + ", second variable is: " + secondVar;
    }

    public int getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(int firstVar) {
        this.firstVar = firstVar;
    }

    public int getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(int secondVar) {
        this.secondVar = secondVar;
    }
}
