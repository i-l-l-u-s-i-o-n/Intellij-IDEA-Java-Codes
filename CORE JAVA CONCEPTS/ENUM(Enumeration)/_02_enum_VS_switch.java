package enumeration;

/**
 * created by Shivam on 23-09-2019.
 *
 */


enum Beer{
    KF,KO,RC,FO
}

public class _02_enum_VS_switch {

    // Until 1.4v, the allowed argument type for SWITCH statement are -> byte, short, char, int.
    // But from 1.5v, corresponding WRAPPER classes(Byte,Short,Character, Integer) and ENUM are allowed.
    // But from 1.7v, STRING types are also allowed!!!!

    // So from 1.5v, we can also pass ENUM type in SWITCH statement.

    public static void main(String[] args) {

        Beer b = Beer.RC;

        // Passing Enum type in Switch ->
        switch (b){

            case KF:
                System.out.println("Kids stuff!");
                break;
            case KO:
                System.out.println("Too light!");
                break;
            case RC:
                System.out.println("Doesn't have that much kick!");
                break;

            case FO:
                System.out.println("Buy 1 get 1 free!");
                break;
            // Invalid case as we are comparing with Non Beer enum type! All case must be Beer enum type!
            // case 78:
            default:
                System.out.println("Other brands are not recommended!");
        }

        // output -> Doesn't have that much kick!


    }
}
