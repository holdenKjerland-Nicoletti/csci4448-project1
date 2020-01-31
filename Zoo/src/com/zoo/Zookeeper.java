package com.zoo;

import java.util.List;

//create Zookeeper class

public class Zookeeper {
    //function to wake up animals, animals response with waking up
    public void wakeUpAnimals(List<Animal> animals){
        System.out.println("Zookeeper wakes up animals:");
        for(Animal animal: animals)
            animal.wakeUp();
    }

    //function to commence rollcall of animals, animals respond with making noise
    public void rollCall(List<Animal> animals){
        System.out.println("Zookeeper starts roll call of animals:");
        for(Animal animal: animals)
            animal.makeNoise();
    }

    //function to feed animals, animals respond with eating
    public void feed(List<Animal> animals){
        System.out.println("Zookeeper feeds animals:");
        for(Animal animal: animals)
            animal.eat();
    }

    //function to exercise animals, animals respond with roaming
    public void exercise(List<Animal> animals){
        System.out.println("Zookeeper exercises animals:");
        for(Animal animal: animals)
            animal.roam();
    }

    //function to shutdown the zoo, animals respond by going to sleep
    public void shutDownZoo(List<Animal> animals){
        System.out.println("Zookeeper shuts down zoo:");
        for(Animal animal: animals)
            animal.goToSleep();
    }
}
