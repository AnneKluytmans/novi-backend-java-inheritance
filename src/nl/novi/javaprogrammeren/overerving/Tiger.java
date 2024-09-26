package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Tiger extends ZooAnimal{
    private final int amountOfStripes;

    public Tiger(String name, String sex, String sound, String nameShelter, DayOfWeek lastFed, String countryOfOrigin, int amountOfStripes) {
        super(name, sex, sound, nameShelter, lastFed, countryOfOrigin);
        this.amountOfStripes = amountOfStripes;
    }

    public int getAmountOfStripes() {
        return amountOfStripes;
    }
}
