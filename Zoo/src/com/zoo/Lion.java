package com.zoo;

//override Feline method for lowest level subclass
public class Lion extends Feline {

    //override makeNoise method: roars
    @Override
    public void makeNoise() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" roars");
    }
}
