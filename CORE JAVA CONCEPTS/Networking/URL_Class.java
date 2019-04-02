import java.net.URL;

/**
 * created by Shivam on 02-04-2019.
 */

class Main1{

    public static void main(String[] args) {

        try{

            URL url=new URL("https://github.com/Shivam1097");

            System.out.println("Protocol : "+url.getProtocol());
            System.out.println("Host name : "+url.getHost());
            System.out.println("Port no : "+url.getPort());   // If port no is not specified in the link, it is -1 by default.
            System.out.println("File name : "+url.getFile());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}

// OUTPUT 
/*
Protocol : https
Host name : github.com
Port no : -1
File name : /Shivam1097
 */
