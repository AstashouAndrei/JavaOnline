package by.java_online.module_4.agregation_composition.task03;

import java.util.Arrays;

public class Country {

    private String countryName;
    private City capital;
    private Region[] regions;
    private int numberOfRegions;
    private int countryArea;


    public Country(String countryName, City capital, Region[] regions) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = regions;
        if (regions != null) {
            for (Region region : regions) {
                countryArea += region.getRegionArea();
                numberOfRegions++;
            }
        }
    }

    @Override
    public String toString() {
        return countryName;
    }

    public void printCapital() {
        System.out.println("The capital of " + countryName + " is " + capital + ".");
    }

    public void printRegionsCenters() {
        System.out.print("The regions centers of " + countryName + " is: ");
        for (Region region : regions) {
            System.out.print(region.getRegionCenter() + " ");

        }
    }

    public void printNumberOfRegions() {
        System.out.println(countryName + " contains " + numberOfRegions + " regions.");
    }

    public void printCountryArea() {
        System.out.println(countryName + " area is " + countryArea + " km" + (char) 178);
    }

    public int getNumberOfRegions() {
        return numberOfRegions;
    }

    public int getCountryArea() {
        return countryArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }
}
