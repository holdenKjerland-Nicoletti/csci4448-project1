package com.zoo;

public class Tiger extends Feline {

    //override makeNoise for Tigers: hisses
    @Override
    public void makeNoise() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" hisses");
    }

}
