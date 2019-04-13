
// Created by Shivam Shukla.


import java.io.*;

class Main{

    public static void main(String[] args) {

        FileOutputStream fout =null;
        FileInputStream fin =null;
        BufferedOutputStream bout=null;
        BufferedInputStream bin=null;

        try {


             fout= new FileOutputStream("Text.txt");

            // BufferedOutputStream can be used in case of networks ,such as downloading a large image, we can put into buffer, instead of putting entire image at once.
            bout=new BufferedOutputStream(fout);

            // It also writes bytes.
            bout.write(65);

            bout.write("\n65 is the ASCII value of 'A'.".getBytes());

            bout.close();
            fout.close();

            fin=new FileInputStream("Text.txt");

            // BufferedInputStream ->
            bin=new BufferedInputStream(fin);

            int ch;
            while ((ch=bin.read())!=-1){
                System.out.print((char)ch);
            }

            bin.close();
            fin.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}