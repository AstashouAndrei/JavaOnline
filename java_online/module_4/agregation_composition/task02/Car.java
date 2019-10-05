package by.java_online.module_4.agregation_composition.task02;

import java.util.Arrays;
import java.util.Random;

public class Car {

    private String brand;
    private String model;
    private Engine engine;
    private Wheel wheel;
    private Wheel[] wheels;
    private boolean isMoving;

    public Car(String brand, String model, Engine engine, Wheel wheel) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
        this.wheels = new Wheel[4];
        this.isMoving = false;

        for (int i = 0; i < 4; i++) {
            wheels[i] = this.wheel;
        }
    }

    public void changeWheel(Wheel spareWheel) {

        Random random = new Random();
        int wheelNumber = random.nextInt(4);

        if (wheel.getRadius() == spareWheel.getRadius()) {
            wheels[wheelNumber] = spareWheel;
        } else {
            System.out.println("Unacceptable wheel radius. Radius should be R" + wheel.getRadius());
        }
    }

    public void refuel() {
        stop();
        System.out.println("Car refueled.");
        move();
    }

    public void move() {
        isMoving = true;
        System.out.println("Car starts moving");
    }

    public void stop() {
        isMoving = false;
        System.out.println("Car stopped");
    }

    public void printCarBrand() {
        System.out.println("Car: " + brand + " / " + model);
    }

    @Override
    public String toString() {
        return "Car: " + brand + " / " + model + ". Engine: " + engine + ". Wheels: " +
                Arrays.toString(wheels);
    }


}
