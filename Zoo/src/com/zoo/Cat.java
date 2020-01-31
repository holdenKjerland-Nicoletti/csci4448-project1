package com.zoo;

//class extends Feline subclass, resulting in lowest level subclass of Animal
public class Cat extends Feline {

    //override makeNoise method for cat: meow
    @Override
    public void makeNoise() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" meows");
    }
}
