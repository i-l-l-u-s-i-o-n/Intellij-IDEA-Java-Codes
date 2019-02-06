package com.company;

public class Main {

    public static void main(String[] args) {

        SportsCar sportsCar=new SportsCar("Bugatti Chiron","Patrol",9,2,"W16(twin V8)");

        sportsCar.handSteering();
        sportsCar.changeGears(7);
        sportsCar.move(420);

    }
}
