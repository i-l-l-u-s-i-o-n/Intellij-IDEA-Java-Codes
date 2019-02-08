package com.company;

public class Main {

    public static void main(String[] args) {

        // All are valid
        Bird bird=new Parrot("Tiwi");
        Animal  animal=new Parrot("Tiwi");
        Parrot parrot=new Parrot("Tiwi");
        canFly canFly=new Parrot("Tiwi");

        System.out.println(parrot.name);
        bird.eat();
        ((Parrot) canFly).breathe();
        System.out.println(animal.getName());
    }
}
