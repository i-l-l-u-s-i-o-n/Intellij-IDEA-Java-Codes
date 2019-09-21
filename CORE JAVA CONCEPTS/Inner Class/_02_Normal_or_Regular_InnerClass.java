package innerClass;

/**
 * created by Shivam on 21-09-2019.
 */

//////////////////////////////// NORMAL/REGULAR INNER CLASSES ////////////////////////////


// Outer class can have following modifiers ->>>>>

    // public, default, final, abstract, strictfp
class  Outer_ {

    int x=10;
    static  int y =101;

    // Inner class can have 3 more modifiers (total 8) - > private, protected, static

    class Inner{

        int x=100;

        public void m1(){

            // Inner class can't declare static members but it can ACCESS static members of Outer class!!!!!!!!
            System.out.println(y);              // 101

            int x=1000;

            // Within Inner class 'this' always refers to Current Inner class obj.
            // To access Outer class object with same name we can use Outer.this.var_name;

            System.out.println(x);              // 1000
            System.out.println(this.x);         // 100
            System.out.println(Inner.this.x);   // 100
            System.out.println(Outer_.this.x);  // 10

        }


        // Nesting of INNER class- > Inside inner class we can define other inner class.

        class InnerMost{

            public void m2(){

                System.out.println("Innermost class");
            }
        }


    }

    public static void main(String[] args) {

        new Outer_().new Inner().m1();


        // Calling nested Innermost class ->

        Outer_ o =new Outer_();
        Outer_.Inner i = o.new Inner();
        Inner.InnerMost innn= i.new InnerMost();

        innn.m2();



    }
}

