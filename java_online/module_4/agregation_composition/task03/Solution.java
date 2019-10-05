package by.java_online.module_4.agregation_composition.task03;

public class Solution {

    public static void main(String[] args) {

        Region gomelRegion = new Region("Gomel Region", "Gomel",
                new District[]{new District("Zhlobin District", new City("Zhlobin"), 2110),
                        new District("Rechytsa District", new City("Rechytsa"), 2713)});

        Region minskRegion = new Region("Minsk Region", "Minsk",
                new District[]{new District("Barysaw District", new City("Barysaw"), 3000),
                        new District("Puchavičy District", new City("Puchavičy"), 2400)});

        Country belarus = new Country("Republic of Belarus",
                new City("Minsk"), new Region[]{gomelRegion, minskRegion});

        System.out.println(belarus);

        belarus.printCapital();

        belarus.printNumberOfRegions();

        belarus.printCountryArea();

        belarus.printRegionsCenters();
    }
}
