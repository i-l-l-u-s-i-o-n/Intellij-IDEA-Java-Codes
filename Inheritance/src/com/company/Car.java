package com.company;

public class Car extends Vehicle {

    int doors;

    public Car(String name, String fuel, int gears, int doors) {
        super(name, fuel, 4, gears);
        this.doors = doors;
    }

    public void handSteering(){
        System.out.println("Handeling Steering of the car...........");
    }

    public void changeGears(int gear){
        System.out.println("Gear changed to : "+gear);
    }

    @Override
    public void move(int speed) {
        System.out.println("Car moving at speed : "+speed);
        super.move(speed);
    }
}
