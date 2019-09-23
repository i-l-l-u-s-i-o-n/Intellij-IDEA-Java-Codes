package enumeration;

/**
 * created by Shivam on 23-09-2019.
 */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// enum containing all the members(CONSTANTS, CONSTRUCTORS, METHODS, VARIABLES)

enum Beer_{

    // There may be a requirement to specify price of different types of beer.
    // So we have to specify the price in () after the constant name.

    KF(100),KO(80),RC(78),FO;

    // Here KF(100) will be equivalent to ->
    // public static final Beer_ KF = new Beer_(100);

    // FO will be equivalent to->
    // public static final Beer_ FO = new Beer_();

    // We MUST create int arg constructor for the 3 constants which specifies price.
    int price;
    Beer_(int price){
        this.price = price;
    }

    // We also have to create no arg constructor, as FO doesn't specify price, so we have to provide default price.
    Beer_(){
        this.price = 50;        // Default price.
    }

    // Creating a method to return the price

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // enum can't contain ABSTRACT METHODS, as enum is by default FINAL, so no child class possible , so no implementation.

    int getPrice(){
        return this.price;
    }
}

// Now accessing all these functionality->

class Test_{

    public static void main(String[] args) {

        // Getting KF object.
        Beer_ kf = Beer_.KF;

        // Now calling getPrice() on KF object to get the price of KF.
        System.out.println(kf.getPrice());      // 100

        // Getting all Beer_ enum values ->
        Beer_[] beers = Beer_.values();

        for (Beer_ b: beers) {
            System.out.println(b + "  :  Price ->  "+ b.getPrice());
        }

        /*

        KF  :  Price ->  100
        KO  :  Price ->  80
        RC  :  Price ->  78
        FO  :  Price ->  50

         */
    }
}