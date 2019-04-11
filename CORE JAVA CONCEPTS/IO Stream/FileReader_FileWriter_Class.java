
// Created by Shivam Shukla.

// Using Character stream class to copy one file data to other file.
// All character stream classes are descended of Reader and Writer class.

// FileReader and FileWriter are character stream classes.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args)  throws IOException {


        File source=new File("Text.txt");

        File destintion =new File("NewFile.txt");


        FileReader fr = new FileReader(source);

        FileWriter fw = new FileWriter(destintion);

//        fr.read() also returns the ascii value of first character or or BYTE representation/
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
            fw.write(ch);

            // We can also directly write STRING using FileWriter as it is a character stream class.
            // fw.write("Hello ");

        }
        fr.close();
        fw.close();

    }


}