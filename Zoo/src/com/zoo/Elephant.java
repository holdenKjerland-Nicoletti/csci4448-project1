package com.zoo;

//class extends Pachyderm subclass, resulting in lowest level subclass of Animal
public class Elephant extends Pachyderm {

    //override makeNoise method for elephant: waves trunk
    @Override
    public void makeNoise() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" waves trunk");
    }
}
