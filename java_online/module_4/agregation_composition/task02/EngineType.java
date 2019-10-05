package by.java_online.module_4.agregation_composition.task02;

public enum EngineType {

    GASOLINE("Gasoline"),
    DIESEL("Diesel"),
    GAS("Gas"),
    ELECTRIC("Electricity");

    private String fuelType;

    EngineType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


}
