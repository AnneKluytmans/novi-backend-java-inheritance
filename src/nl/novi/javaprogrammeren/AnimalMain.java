package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.Cat;
import nl.novi.javaprogrammeren.overerving.Dog;
import nl.novi.javaprogrammeren.overerving.Wolf;

import java.time.DayOfWeek;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dogMaple = new Dog("Maple", "male", "wafwafwaf", "Golden Retriever", "Peter",
                "Edgard&Cooper");
        Cat catWoezel = new Cat("Woezel", "female", "miauwmiauw", "Bobtail", "Mirjam",
                "Whiskas", true);
        Wolf wolfBas = new Wolf("Bas", "male", "Whoooohoooo", "The woods", DayOfWeek.WEDNESDAY,
                "Germany", "Dark Moon");

        dogMaple.eat("rabbit ears");
        catWoezel.sleep();
        wolfBas.makeSound();
        wolfBas.move();
    }
}
