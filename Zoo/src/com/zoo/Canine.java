package com.zoo;

//extend Animal class by creating first subclass level
public class Canine extends Animal {

    //override roam method for canines
    @Override
    public void roam() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" roams in the grass");
    }
}
