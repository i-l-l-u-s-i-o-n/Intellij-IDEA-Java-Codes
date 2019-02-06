public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int velocity;

    public Car(String name,int cylinders){
        this.cylinders=cylinders;
        this.name=name;
        this.engine=true;
        this.wheels=4;
        this.velocity=0;

    }


    public void startEngine(){
        System.out.println("Starting engine of "+getName());
    }
    public void accelerate(int rate){
        velocity+=rate;
        System.out.println("Accelerating "+getName()+" to speed : "+velocity+" KMPH.");

    }

    public String showMaxSpeed(){
        return "Not defined .";
    }

    public void brake(int rate){
        velocity-=rate;
        if (velocity<=0)
            System.out.println("Car stopped.");
        else
            System.out.println("Speed reduced to : "+velocity+" KMPH.");
    }

    public String getName() {
        return name;
    }

}
class Bugatti extends Car{
    public Bugatti() {
        super("Bugatti Chiron",8);
    }

    public String showMaxSpeed(){
        return "420 KMPH";
    }
}


class Porche extends Car {
    public Porche() {
        super("Porche Cynnane 911",6);
    }

    public String showMaxSpeed(){
        return "380 KMPH";
    }
}
class Audi extends Car {
    public Audi() {
        super("Audi R8",4);
    }

    public String showMaxSpeed(){
        return "320 KMPH";
    }
}
class Lexus extends Car {
    public Lexus() {
        super("Lexus 29M",6);
    }

    public String showMaxSpeed(){
        return "340 KMPH";
    }
}


class Main{
    public static void main(String...s){

        for (int i=1;i<11;i++){
            System.out.println();
            Car Manufacturer =getRandomCar();
            System.out.println("Car #: "+i+"\n"+"Car name : "+ Manufacturer.getName());
            Manufacturer.startEngine();
            System.out.println("Max Speed is : "+ Manufacturer.showMaxSpeed());
            Manufacturer.accelerate(280);
            Manufacturer.showMaxSpeed();
            Manufacturer.brake(190);
        }




    }

    public static Car getRandomCar(){
        int randomNumber=(int) (Math.random()*4 + 1);
        switch (randomNumber){
            case 1:
                return new Bugatti();
            case 2:
                return new Porche();
            case 3:
                return new Audi();
            case 4:
                return new Lexus();
        }

        return null;
    }
}


