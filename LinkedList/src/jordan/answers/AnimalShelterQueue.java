package jordan.answers;

import jordan.structures.animals.AnimalQueue;

import java.util.Scanner;

/**
 * Created by jordandukes on 6/3/17.
 */
public class AnimalShelterQueue {
    public AnimalShelterQueue(){
//        System.out.println("Please enter a number: ");
//        Scanner in = new Scanner(System.in);

        //Add some dogs and cats
        AnimalQueue animals = new AnimalQueue();
        animals.enqueueAnimal("Loki", true);
        animals.enqueueAnimal("Barkus Aurellius", false);
        animals.enqueueAnimal("Stimpy", false);
        animals.enqueueAnimal("Fenrir", true);
        animals.enqueueAnimal("Pixel", true);
        animals.enqueueAnimal("Spot", false);

        System.out.println(animals.dequeueAnimal().animalName);
        System.out.println(animals.dequeueAnimal().animalName);


    }
}


