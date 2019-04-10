

//Created by Shivam Shukla.

import java.io.DataInputStream;
import java.io.IOException;

class Main{

    static float length=0;
    static float breadth=0;

    static DataInputStream din;

    public static void main(String[] args) {

        try {
            //System.in indicates that it is a Standard Input from a keyboard.
            din=new DataInputStream(System.in);

            // If we use ->
            // length=din.readFloat();
            // It will read each 4 bytes from the input and then gives us output.
            // So it will give completely different value from what we enter.
            // That is why it only used for reading data from file written using DataOutputStream.

            // Instead we cat use ->

            length=Float.valueOf(din.readLine());


            breadth=Float.valueOf(din.readLine());

            System.out.println("Area is : "+length*breadth);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

/*
OUTPUT ->

50.00
100.00
Area is : 5000.0

 */