package com.company;

public abstract class Animal {
    String name;

    Animal(String name){
        this.name=name;
    }
    public abstract void eat();
    public abstract void breathe();

    //Abstract class can have private methods.
    private void pri(){

    }

    public String getName(){
        return name;
    }
}
