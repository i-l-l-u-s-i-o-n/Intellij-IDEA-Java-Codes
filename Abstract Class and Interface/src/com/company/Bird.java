package com.company;

public abstract class Bird extends Animal implements canFly{

    public Bird(String Name){
        super(Name);
    }


    @Override
    public void eat() {
        System.out.println(name+" is eating !");
    }

    @Override
    public void breathe() {
        System.out.println(name+" is breathing !");
    }

    // We should not add fly()method to Bird class as Bat can also fly.
    // We can use a interface instead to show the relationship "canFly" and can implement in Bird class.


    @Override
    public void fly() {
        System.out.println(name+" flying !");
    }


}
