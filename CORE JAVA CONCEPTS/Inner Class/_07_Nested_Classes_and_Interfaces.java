package innerClass;

import java.util.Collection;
import java.util.Set;

/**
 * created by Shivam on 21-09-2019.
 */

// There we anything inside anything w.r.t. class and interfaces ie. class inside interface, interface inside class .....


// CASE 1 -> Class inside a Class --->>>>

    // Without existing one type of object if there is no chance of existing another type of object, then we should go for
    // class inside a class (Inner classes).
    // Example - University consist of several departments, without university, there is no existence of Department, So we have to define Department class inside University class!


class University{

    class Department{

    }

}


// CASE 2 -> Interface inside a class ---->>>>

    // Inside a class if we require multiple implementation of an interface and these implementation are related to
    // particular class, then we can define interface inside a class.

// Example ->

class VehicleType{


    // Interface inside a class is always STATIC but need not be PUBLIC.
    interface Vehicle{
        int getNoOfWheels();
    }

    class Bus implements Vehicle{

        @Override
        public int getNoOfWheels() {
            return 6;
        }
    }

    class Auto implements Vehicle{

        @Override
        public int getNoOfWheels() {
            return 3;
        }
    }
}



// CASE 3 - Interface inside an interface ---->>>>>>

// It's example is Map interface which defines Entry interface inside Map interface.
// Map is a group of key value pairs and each key value pair is called Entry.
// Without existing Map object, there is no chance of existing Entry object, so it is define inside Map interface.

interface Map_{


    void m1();

    // Inner interface is always PUBLIC STATIC as it must be available to the class for implementation.

    interface Entry{

        Set getEntrySet();
        Set getKeys();
        Collection getValues();

    }
}

// If we are implementing Outer interface, we need not to give implementation for inner interface methods.
class Impl implements Map_{

    @Override
    public void m1() {

    }
}
// Similarly, If we are implementing Inner interface, we need not to give implementation for outer interface methods.
class  Impll implements Map_.Entry{

    @Override
    public Set getEntrySet() {
        return null;
    }

    @Override
    public Set getKeys() {
        return null;
    }

    @Override
    public Collection getValues() {
        return null;
    }
}



// CASE 4 - Class inside an interface ---->>>>>>

// If functionality of a class is closely associated with interface, then it is highly recommended to declare class inside interface.
// Suppose a interface method require a parameter as a object of the class which is only required for that interface, then we can define that class
// inside that interface. This is also applicable if the object of a class is the Return type of a method.

// Example ->

interface EmailService{

    void sendEmail(EmailDetails details);


    // EmailDetails class is required only for EmailService interface , not anywhere else, so it is declared inside Interface.

    // Class defined inside Interface is always PUBLIC STATIC!!!!!!!!!!!!!!!!!!!
    class EmailDetails{

        String to;
        String from;
        String cc_list;
        String subject;
        String body;
    }
}

// We can also define Class inside an interface when we want to provide default implementation to the interface methods.
// As the class defined inside interface is public static, so we can directly use default implementation class.

interface  Vehicle{

    int getNoOfWheel();

    class DefaultVehicle implements Vehicle{

        // Generally We talk about vehicle, most common is Two Wheeler, so default vehicle will return 2 as no. of wheel
        public int getNoOfWheel() {
            return 2;
        }
    }
}

class Bus implements  Vehicle{

    public static void main(String[] args) {

        Vehicle.DefaultVehicle defaultVehicle =new Vehicle.DefaultVehicle();
        System.out.println(defaultVehicle.getNoOfWheel());      // 2

        Bus bus = new Bus();
        System.out.println(bus.getNoOfWheel());                 // 6

    }

    @Override
    public int getNoOfWheel() {
        return 6;
    }
}