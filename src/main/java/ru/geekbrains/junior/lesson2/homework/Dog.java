package ru.geekbrains.junior.lesson2.homework;

public class Dog extends Animal{

private final String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + " is barking.");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", breed='" + getBreed() + "'}";
    }
}
