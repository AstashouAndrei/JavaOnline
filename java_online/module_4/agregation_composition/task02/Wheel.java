package by.java_online.module_4.agregation_composition.task02;

public class Wheel {

    private String brand;
    private int radius;
    private String type;

    public Wheel(String brand, int radius, String type) {
        this.brand = brand;
        this.radius = radius;
        this.type = type;
    }

    @Override
    public String toString() {
        return brand + " R" + radius + " " + type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
