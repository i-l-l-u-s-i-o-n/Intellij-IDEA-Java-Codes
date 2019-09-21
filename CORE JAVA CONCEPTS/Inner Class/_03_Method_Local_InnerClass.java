package innerClass;

/**
 * created by Shivam on 21-09-2019.
 */



// Sometimes we can declare a class inside a method, such type of inner class are called method local inner class(MLIC).

    // Main purpose of MLIC is to define method specific repeatedly required functionality.
    // It is best suitable for to meet nested method requirement.

    // It is rarely used Inner class as it has very less scope because we can access it only INSIDE A METHOD!!!!!!!!!!

    // Anonymous IC are most commonly used inner classes!!!!!!!!!!!!!!!!!!!

class Outer__{


    // We can declare MLIC in both Static and non static methods!!!!!!!!!!

    // If the method is NON STATIC, then we can access both( instance and static members) from MLIC.
    // But if method is STATIC, MLIC can't access the NON STATIC members.
    public void m1(){

        class Inner {

            public void sum(int i,int j){
                System.out.println(i+j);
            }

        }

        Inner i =new Inner();

        i.sum(10,20);

        i.sum(100,200);

        i.sum(1000,2000);
    }


    public static void main(String[] args) {


        new Outer__().m1();

    }
}
