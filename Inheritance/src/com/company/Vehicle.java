package com.company;

public class Vehicle {

    public String name;
    String fuel;
    int wheels;
    int gears;

    public Vehicle(String name, String fuel, int wheels, int gears) {
        this.name = name;
        this.fuel = fuel;
        this.wheels = wheels;
        this.gears = gears;
    }

    public void move(int speed){
        System.out.println("Vehicle Moving at speed ........."+speed);
    }

}
