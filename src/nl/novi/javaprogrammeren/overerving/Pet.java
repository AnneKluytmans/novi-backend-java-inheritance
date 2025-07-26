package nl.novi.javaprogrammeren.overerving;

public class Pet extends Animal {
    private final String breed;
    private String nameOwner;
    private String favoriteFoodBrand;

    public Pet(String name, String sex, String sound, String breed, String nameOwner, String favoriteFoodBrand) {
        super(name, sex, sound);
        this.breed = breed;
        this.nameOwner = nameOwner;
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public String getBreed() {
        return breed;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }


}
