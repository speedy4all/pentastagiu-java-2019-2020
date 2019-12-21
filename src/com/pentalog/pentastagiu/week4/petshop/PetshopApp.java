package com.pentalog.pentastagiu.week4.petshop;

import com.pentalog.pentastagiu.week3.petshop.Animal;
import com.pentalog.pentastagiu.week4.petshop.Dog;

public class PetshopApp {
    public static void main(String[] args) {
        // when we create an instance of a specific type (Dog), the reference used can be any of the parents of the class or the class itself
        // reference can be of type: Dog, Animal, Object
        // polymorphism aplies also to abstract classes and interfaces, so the reference can be also a parent abstract class or an interface
        // what it matters when the code is run is the object itself, if it's a Dog, it will act like a Dog at runtime, no matter what reference we used
        Dog firstDog = new Dog("Micky", 3, 200);
        Animal secondDog = new Dog("Picky", 7, 200);
        Object thirdDog = new Dog("Ricky", 5, 200);

        firstDog.makeNoise();
        secondDog.makeNoise();
        if (thirdDog instanceof Dog) {
            ((Dog)thirdDog).makeNoise();
        }

        System.out.println(firstDog);
        System.out.println(firstDog.toString());

    }
}
