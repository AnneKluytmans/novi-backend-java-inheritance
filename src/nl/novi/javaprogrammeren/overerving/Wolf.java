package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Wolf extends ZooAnimal {
    private String namePack;

    public Wolf(String name, String sex, String sound, String nameShelter, DayOfWeek lastFed, String countryOfOrigin, String namePack) {
        super(name, sex, sound, nameShelter, lastFed, countryOfOrigin);
        this.namePack = namePack;
    }

    public String getNamePack() {
        return namePack;
    }

    public void setNamePack(String namePack) {
        this.namePack = namePack;
    }
}
