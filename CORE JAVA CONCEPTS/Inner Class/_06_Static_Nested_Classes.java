package innerClass;

/**
 * created by Shivam on 21-09-2019.
 */
class Outer___  {



    // Sometimes we can declare inner class with static modifier, such type of Inner class is called static Nested Classes

    // We are saying it Static NESTED class because in case of other inner classes, there is no chance of existing the inner class object
    // without Outer call , but in case of declaring the inner class as static, there is a chance of existing the static inner class without
    // existing Outer class. So due to this weak association between Outer and static inner class, it is said ,STATIC NESTED INNER CLASS.



    // Static Nested class can HAVE STATIC MEMBERS and also MAIN method!!!!!!!!!!!!!!!!!!!!!!!!
    // So we can run Nested class from Command prompt also ->
        // java Outer___$Nested

    // From normal inner class, we can access both static ans not static member of outer class directly.
    // BUT from SNC, we can access ONLY static members!!!!!!!!!!!!!!!!!!!!!!!!

    int x =78;
    static  int y= 78;

    static class Nested{

        public void m1(){

            System.out.println("Static nested class !!"+ y);
        }
    }


    public static void main(String[] args) {

        Nested nested =new Nested();
        nested.m1();


        // If we have to create object of nested class outside the Outer class, then we have to use the Outer class name
        // to access the Nested class.

        Outer___.Nested n =new Outer___.Nested();
        n.m1();
    }
}
