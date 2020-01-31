package com.zoo;

public class Rhino extends Pachyderm {

    //override makeNoise method for Rhinos: snorts
    @Override
    public void makeNoise(){
        System.out.println(getName()+" the "+getClass().getSimpleName()+" snorts");
    }
}
