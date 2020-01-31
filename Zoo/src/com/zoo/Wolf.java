package com.zoo;

public class Wolf extends Canine {

    //override makeNoise for Wolf: howls
    @Override
    public void makeNoise() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" howls");
    }
}
