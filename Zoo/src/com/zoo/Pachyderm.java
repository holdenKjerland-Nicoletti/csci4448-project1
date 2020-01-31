package com.zoo;

//extend Animal method one level: Pachyderm
public class Pachyderm extends Animal {

    //override roam method for Pachyderms
    @Override
    public void roam() {
        System.out.println(getName()+" the "+getClass().getSimpleName()+" roams around the desert");
    }
}
