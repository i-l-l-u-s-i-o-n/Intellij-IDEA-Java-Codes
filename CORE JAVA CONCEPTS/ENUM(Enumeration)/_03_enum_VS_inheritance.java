package enumeration;

/**
 * created by Shivam on 23-09-2019.
 */


// Every Enum in Java is DIRECT child of java.lang.Enum class!
    // i.i every enum is already extending Enum class.
    // So it is NOT POSSIBLE for enum to extend any other enum as Java doesn't support Multiple Inheritance.

// Also the enum is implicitly FINAL, so we can't create child enum.

// SO by above 2 conclusions, INHERITANCE is NOT APPLICABLE to Enum EXPLICITLY! We can't use EXTENDS keyword for Enum.

// A class also can't extend Enum as it is final.

// enum can IMPLEMENT any number of INTERFACES!

// java.lang.Enum is a abstract class and direct child class of Object class.
// It implements Serializable and Comparable Interfaces.

interface Test{
    public void show();
}

enum X implements Test{

    // If we defining anything else other thanIntegral Constants, then ';' is MUST before defining methods or inner class or variables.
    //;

    // If we are defining also defining the constants then also ; is MUST.
    T1,T2 ;


    @Override
    public void show() {
        System.out.println("This method can be accessed using enum constants!");
    }
}

public class _03_enum_VS_inheritance {

    public static void main(String[] args) {

        // To call a method defined inside enum->
        X x =X.T1;
        x.show();               // This method can be accessed using enum constants!

    }

}

