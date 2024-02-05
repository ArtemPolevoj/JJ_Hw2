package ru.geekbrains.junior.lesson2.homework;

public class Cat extends Animal{
    private final boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    public boolean isIndoor() {
        return isIndoor;
    }
    @Override
    public void makeSound() {
        System.out.println("Cat " + name + " is meowing.");
    }
    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", isIndoor='" + isIndoor() + "'}";
    }

}
