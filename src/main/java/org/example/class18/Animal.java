package org.example.class18;

public class Animal {
    private final String name;
    private final String color;

    private final int age;

    private final double weight;

    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    void printInfo() {
        System.out.println(name + " " + color + " " + age + " " + weight);
    }

}

class Dog extends Animal{

    Dog(String name, String color, int age, double weight ){
    super(name, color, age,weight);
    }
}

class AnimalTester{

    public static void main(String[] args) {
        Dog d= new Dog("Jacky","Black",10,20);
            d.printInfo();
        }
    }

