
// Create by Shivam Shukla.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Main{
    public static void main(String[] args) {


        // Used to write BYTE in a file.
        FileOutputStream fout=null;

        // Used to read bytes from a file.
        FileInputStream fin=null;

        try {

            // ====================================== FILE OUTPUT STREAM =====================================================//


            // If the file doesn't exist , a new file will be created.
            fout=new FileOutputStream("Text.txt");


            // We are writing 65 which is the ASCII value of 'A'.
            // So A will be written in file.
            fout.write(83);


            byte letters[]= {'H','I','V','A','M',' ','\n'};

            // We can also write a byte array.
            fout.write(letters);


            // We can also store string into files by converting it into byte array as follows ->

            String sample="This File is written using FileOutputStream and can be read using FileInputStream.";

            //Converting string to byte array->
            byte string[]=sample.getBytes();

            fout.write(string);

            fout.close();
            System.out.println("Writing is over !!");


            // ====================================== FILE INPUT STREAM =====================================================//

            // If the file is in same directory, we need not to specify PATH, just use filename, else
            // We have to specify the whole PATH of the file.
            fin=new FileInputStream("Text.txt");

            // fin.available() returns the no. of BYTES remaining in the file.
            System.out.println(fin.available());

            //Until no byte is left .
            while(fin.available()!=0){
                // It will print the BYTE value i.e 65 83 .......
                System.out.print(fin.read()+" ");
            }

            // Here fin.available() =0

            fin.close();


            System.out.println("============================================================");

            // We have to again open the file because for previous fin, the available became 0, So we have to reinitialise it.
            fin=new FileInputStream("Text.txt");

            // Another method of iterating ->
            int i=0;

            // At the end of the file -1 is stored as EOF.
            while((i=fin.read())!=-1){
                // It will print the CHARACTER value for the BYTES stored in file .
                System.out.print((char)i);
            }

            fin.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*

OUTPUT ->

Writing is over !!
90
83 72 73 86 65 77 32 10 84 104 105 115 32 70 105 108 101 32 105 115 32 119 114 105 116 116 101 110 32 117 115 105 110 103 32 70 105 108 101 79 117 116 112 117 116 83 116 114 101 97 109 32 97 110 100 32 99 97 110 32 98 101 32 114 101 97 100 32 117 115 105 110 103 32 70 105 108 101 73 110 112 117 116 83 116 114 101 97 109 46 ============================================================
SHIVAM
This File is written using FileOutputStream and can be read using FileInputStream.

 */
