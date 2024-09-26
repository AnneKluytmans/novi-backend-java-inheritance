package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class ZooAnimal extends Animal {
    private String nameShelter;
    private DayOfWeek lastFed;
    private final String countryOfOrigin;

    public ZooAnimal(String name, String sex, String sound, String nameShelter, DayOfWeek lastFed, String countryOfOrigin) {
        super(name, sex, sound);
        this.nameShelter = nameShelter;
        this.lastFed = lastFed;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getNameShelter() {
        return nameShelter;
    }

    public DayOfWeek getLastFed() {
        return lastFed;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setNameShelter(String nameShelter) {
        this.nameShelter = nameShelter;
    }

    public void setLastFed(DayOfWeek lastFed) {
        this.lastFed = lastFed;
    }

}
