package com.zoo;

import java.util.Random;

//extend Animal class by creating first subclass level Feline
public class Feline extends Animal{

    //override roam method for felines
    @Override
    public void roam() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" roams in the trees");
    }

    //override eat method to make a random choice of actions when zookeeper asks them to eat
    @Override
    public void eat(){
        Random random = new Random();
        int n = random.nextInt(3);
        if(n == 0)
            super.roam();
        else if(n==1)
            makeNoise();
        else
            goToSleep();

    }
}
