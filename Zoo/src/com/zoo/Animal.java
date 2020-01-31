package com.zoo;

//abstract class implements the zoo interface
public abstract class Animal implements Zoo {
    //represents the name of the animal (ie Charlie)
    private String name;

    //getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //animal wake up function prints name of animal, type of animal, followed by general descriptive of activity: wakes up.
    public void wakeUp() {
        System.out.println(getName()+" the "+this.getClass().getSimpleName()+" wakes up");
    }

    //animal wake up function prints name of animal, type of animal, followed by general descriptive of activity: makes noise.
    //this method is overridden in lowest subclass level (ie a Cat will make a different noise than a Tiger, but both are in Feline subclass).
    public void makeNoise() {
        System.out.println(getName()+" the "+this.getClass().getSimpleName()+" makes noise");
    }

    //animal wake up function prints name of animal, type of animal, followed by general descriptive of activity: eats.
    //this method is overridden in the Feline subclass which results in a random behavior when the zookeeper feeds them.
    public void eat() {
        System.out.println(getName()+" the "+this.getClass().getSimpleName()+" eats their food");
    }

    //animal wake up function prints name of animal, type of animal, followed by general descriptive of activity: roams.
    //this method is overridden in the first-level subclass (ie Felines will roam in the trees, Pachyderms will roam in the desert).
    public void roam() {
        System.out.println(getName()+" the "+this.getClass().getSimpleName()+" roams");
    }

    //animal wake up function prints name of animal, type of animal, followed by general descriptive of activity: goes to sleep.
    public void goToSleep() {
        System.out.println(getName()+" the "+this.getClass().getSimpleName()+" goes to sleep");
    }




}
