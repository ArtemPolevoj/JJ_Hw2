package ru.geekbrains.junior.lesson2.homework;

abstract class Animal {
    protected String name;
    protected int age;
    abstract void makeSound();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{class " + getClass().getSimpleName() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
