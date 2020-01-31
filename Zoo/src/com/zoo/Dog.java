package com.zoo;

//class extends Canine subclass, resulting in lowest level subclass of Animal
public class Dog extends Canine {

    //override makeNoise method for dog: bark
    @Override
    public void makeNoise() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" barks");
    }
}
