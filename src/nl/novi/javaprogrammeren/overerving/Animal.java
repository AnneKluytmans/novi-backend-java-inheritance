package nl.novi.javaprogrammeren.overerving;

public abstract class Animal{
    private String name;
    private final String sex;
    private final String sound;


    public Animal(String name, String sex, String sound){
        this.name = name;
        this.sex = sex;
        this.sound = sound;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public String getSound(){
        return sound;
    }


    public void move() {
        System.out.println(name + " moved 0.25 meters.");
    }

    public void makeSound() {
        System.out.println(name + ": '" + sound + "'");
    }

    public void sleep() {
        System.out.println(name + " is sleeping for the next 8 hours. Zzzzz");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ". mhjammjammjammm");
    }

}
