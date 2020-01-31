package com.zoo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //instantiate an array list of animals
        List<Animal> zoo = new ArrayList<Animal>();

        //instantiate zookeeper
        Zookeeper zookeeper = new Zookeeper();

        //instantiate animal objects of every type, set name, and add to the zoo array
        Animal charlie = new Cat();
        charlie.setName("Charlie");
        zoo.add(charlie);

        Animal connie = new Cat();
        connie.setName("Connie");
        zoo.add(connie);

        Animal eli = new Elephant();
        eli.setName("Eli");
        zoo.add(eli);

        Animal ezra = new Elephant();
        ezra.setName("Ezra");
        zoo.add(ezra);

        Animal doug = new Dog();
        doug.setName("Doug");
        zoo.add(doug);

        Animal darcy = new Dog();
        darcy.setName("Darcy");
        zoo.add(darcy);

        Animal warren = new Wolf();
        warren.setName("Warren");
        zoo.add(warren);

        Animal wanda = new Wolf();
        wanda.setName("Wanda");
        zoo.add(wanda);

        Animal heidi = new Hippo();
        heidi.setName("Heidi");
        zoo.add(heidi);

        Animal hugo = new Hippo();
        hugo.setName("Hugo");
        zoo.add(hugo);

        Animal larry = new Lion();
        larry.setName("Larry");
        zoo.add(larry);

        Animal linda = new Lion();
        linda.setName("Linda");
        zoo.add(linda);

        Animal rhonda = new Rhino();
        rhonda.setName("Rhonda");
        zoo.add(rhonda);

        Animal ron = new Rhino();
        ron.setName("Ron");
        zoo.add(ron);

        Animal tonya = new Tiger();
        tonya.setName("Tonya");
        zoo.add(tonya);

        Animal tony = new Tiger();
        tony.setName("Tony");
        zoo.add(tony);

        //zookeeper executes duties
        zookeeper.wakeUpAnimals(zoo);
        System.out.println("---------------------------------");
        zookeeper.rollCall(zoo);
        System.out.println("---------------------------------");
        zookeeper.feed(zoo);
        System.out.println("---------------------------------");
        zookeeper.exercise(zoo);
        System.out.println("---------------------------------");
        zookeeper.shutDownZoo(zoo);

//        //redirecting system output to outfile (https://www.geeksforgeeks.org/redirecting-system-out-println-output-to-a-file-in-java/)
//        PrintStream o = new PrintStream(new File("dayatthezoo.out"));
//
//        // Store current System.out before assigning a new value
//        PrintStream console = System.out;
//
//        // Assign o to output stream
//        System.setOut(o);
//        System.out.println("Nicole Richter & Holden Kjerland-Nicoletti & Munkhbayan (Bryan) Togtokh\nProject 1 Question 4\n\n");
//
//        zookeeper.wakeUpAnimals(zoo);
//        System.out.println("---------------------------------");
//        zookeeper.rollCall(zoo);
//        System.out.println("---------------------------------");
//        zookeeper.feed(zoo);
//        System.out.println("---------------------------------");
//        zookeeper.exercise(zoo);
//        System.out.println("---------------------------------");
//        zookeeper.shutDownZoo(zoo);

    }
}
