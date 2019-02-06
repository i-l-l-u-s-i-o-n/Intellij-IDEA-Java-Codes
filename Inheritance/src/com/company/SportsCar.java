package com.company;

public class SportsCar extends Car{

    public String engine;

    public SportsCar(String name, String fuel, int gears, int doors, String engine) {
        super(name, fuel, gears, doors);
        this.engine = engine;
    }



    @Override
    public void handSteering() {
        System.out.println("Power Steering.......");

    }

    @Override
    public void move(int speed) {

        System.out.println("Sports car "+this.name+" running at : "+speed);
        super.move(speed);
    }
}
