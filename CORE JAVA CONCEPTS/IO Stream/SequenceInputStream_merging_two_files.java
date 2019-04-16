
// Created by Shivam Shukla.

import java.io.*;

class Main{

    public static void main(String[] args) {

        FileInputStream fin1 =null;
        FileInputStream fin2 =null;


        // It can be used to handel 2 files together...........
        SequenceInputStream sin=null;

        try {


            fin1=new FileInputStream("Text.txt");
            fin2=new FileInputStream("file.txt");

            // Merging 2 files data.
            sin=new SequenceInputStream(fin1,fin2);

            // Storing the merged data into another file.

            File file=new File("Merged.txt");

            FileWriter fw=new FileWriter(file);

            int i;
            while (( i=sin.read())!=-1){
                System.out.print((char)i);
                fw.write(i);
            }


            fw.close();
            sin.close();
            fin1.close();
            fin2.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}