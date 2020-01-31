package com.zoo;

//extend Pachyderm to lowest subclass hippo
public class Hippo extends Pachyderm {

    //override makeNoise method: yawns
    @Override
    public void makeNoise() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" yawns");
    }
}
