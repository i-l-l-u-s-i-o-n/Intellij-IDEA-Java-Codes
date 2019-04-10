
// Created by Shivam Shukla.

import java.io.File;
import java.io.IOException;

// Using File class to get details about file.


class Main{

    public static void getPaths( File f) throws IOException {
        System.out.println("Name : "+f.getName());
        System.out.println("Path : "+f.getPath());
        System.out.println("Parent : "+f.getParent());
    }


    public static void getInfo(File f) throws IOException{
        if (f.exists()){

            System.out.println("File exists : ");
            System.out.println(f.canRead() ? "and is READABLE ": "");
            System.out.println(f.canWrite() ? " and is WRITABLE .":"");
            System.out.println("Last modified : "+f.lastModified());
            System.out.println("Size is : "+f.length()+" bytes");
        }else {
            System.err.println("File doesn't exists :( ");
        }
    }


    public static void main(String[] args) throws IOException {

        // This file doesn't exists !
        File file=new File("test.txt");

        getPaths(file);
        getInfo(file);


        // This file exists !
        file=new File("file.txt");
        getPaths(file);
        getInfo(file);
    }
}

/*
OUTPUT ->

Name : test.txt
Path : test.txt
Parent : null
File doesn't exists :( 
Name : file.txt
Path : file.txt
Parent : null
File exists : 
and is READABLE 
 and is WRITABLE .
Last modified : 1552227950683
Size is : 76 bytes

 */