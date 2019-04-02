import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * created by Shivam on 02-04-2019.
 */

class Main{

    public static void main(String[] args) {

        try{

            URL url=new URL("https://github.com/Shivam1097");

            // It can be used to get the html of  a page.
            URLConnection ucn=url.openConnection();

            InputStream is=ucn.getInputStream();

            int b;
            while((b= is.read())!=-1){
                
                // The html of the given URL.
                System.out.print((char)b);
            }



        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
