
// Created by Shivam Shukla.


import java.io.IOException;
import java.io.RandomAccessFile;

class Main{
    public static void main(String[] args) {

        try {


            // We can set the file pointer at random location .......
            // We can specify the mode of file  i.r. read|write|read-write.
            RandomAccessFile raf = new RandomAccessFile("Random.txt", "rw");

            // Writing the file

            raf.writeChar('S');


            raf.writeFloat(43.22f);

            raf.writeInt(65);

            raf.writeBoolean(true);

            raf.writeDouble(43.22);

            raf.writeChars("Hello can be written directly !");

            // Go to the beginning
            raf.seek(0);


            // Reading from the file
            // The order of reading type must be sme as writing file.
            System.out.println(raf.readChar());
            System.out.println(raf.readFloat());
            System.out.println(raf.readInt());


            // Go to second item
            raf.seek(2);
            System.out.println(raf.readFloat());

            // At last of the file.
            raf.seek(raf.length());
            raf.writeBoolean(false);

            raf.seek(raf.length()-1);
            System.out.println(raf.readBoolean());



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}