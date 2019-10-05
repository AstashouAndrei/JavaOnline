package by.java_online.module_4.agregation_composition.task03;

public class District {

    private String districtName;
    private City districtCenter;
    private int districtArea;

    public District(String districtName, City districtCenter, int districtArea) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
        this.districtArea = districtArea;
    }

    @Override
    public String toString() {
        return districtName + ". Administrative center: " + districtCenter +
                ". Area: " + districtArea + " km" + (char) 178;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public int getDistrictArea() {
        return districtArea;
    }

    public void setDistrictArea(int districtArea) {
        this.districtArea = districtArea;
    }
}
