package nl.novi.javaprogrammeren.overerving;

public class Cat extends PetAnimal {
    private final boolean isOutdoor;

    public Cat(String name, String sex, String sound, String breed, String nameOwner, String favoriteFoodBrand, boolean isOutdoor) {
        super(name, sex, sound, breed, nameOwner, favoriteFoodBrand);
        this.isOutdoor = isOutdoor;
    }

    public boolean getIsOutdoor() {
        return isOutdoor;
    }
}
