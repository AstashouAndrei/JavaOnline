package by.java_online.module_4.agregation_composition.task03;

public class Region {

    private String regionName;
    private String regionCenter;
    private District[] districts;
    private int regionArea;

    public Region(String regionName, String regionCenter, District[] districts) {
        this.regionName = regionName;
        this.regionCenter = regionCenter;
        this.districts = districts;
        for (District district : districts) {
            regionArea += district.getDistrictArea();
        }
    }

    @Override
    public String toString() {
        return regionName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public int getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(int regionArea) {
        this.regionArea = regionArea;
    }

    public String getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(String regionCenter) {
        this.regionCenter = regionCenter;
    }
}
