package by.java_online.module_4.agregation_composition.task02;

public class Solution {

    public static void main(String[] args) {

        Engine engine = new Engine(EngineType.GASOLINE, 150);

        Wheel wheels = new Wheel("Michelin", 18, "winter");

        Car car = new Car("Audi", "A3", engine, wheels);
        System.out.println(car);

        car.changeWheel(new Wheel("Nokian", 18, "summer"));
        System.out.println(car);

        car.refuel();
        car.printCarBrand();
    }
}
