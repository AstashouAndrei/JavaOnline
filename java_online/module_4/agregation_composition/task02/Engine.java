package by.java_online.module_4.agregation_composition.task02;

public class Engine {

    private EngineType type;
    private int power;

    public Engine(EngineType type, int power) {
        this.type = type;
        this.power = power;
    }

    @Override
    public String toString() {
        return type.getFuelType() + " " + power + "hp";
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
