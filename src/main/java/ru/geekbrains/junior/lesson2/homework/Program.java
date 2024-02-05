package ru.geekbrains.junior.lesson2.homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Animal[] animals = {
                new Dog("Buddy", 3, "Labrador"),
                new Cat("Whiskers", 5, true)
        };
        StringBuilder text = new StringBuilder("Methods: ");
        for (Animal animal : animals) {
            System.out.println(animal);
            Method[] methods = animal.getClass().getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                text.append(methods[i].getName());
                if (i != methods.length - 1) {
                    text.append(", ");
                } else {
                    text.append(".");
                }
            }
            System.out.println(text);
            text.delete(10, text.length());

            Method makeSoundMethod;
            try {
                makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (NoSuchMethodException e) {
                System.out.println("Method \"makeSound\" in class " +
                        animal.getClass().getSimpleName() +
                        " name " +
                        animal.getName() +
                        " is not found");
            } catch (Exception e) {
                System.out.println("Method error");
            }
            System.out.println();
        }
    }
}
