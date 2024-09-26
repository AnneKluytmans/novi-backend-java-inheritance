package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Lion extends ZooAnimal{
    private int amountOfChildren;

    public Lion(String name, String sex, String sound, String nameShelter, DayOfWeek lastFed, String countryOfOrigin, int amountOfChildren) {
        super(name, sex, sound, nameShelter, lastFed, countryOfOrigin);
        this.amountOfChildren = amountOfChildren;
    }


    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }
}
