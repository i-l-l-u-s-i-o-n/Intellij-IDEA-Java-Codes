
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * created by Shivam on 02-04-2019.
 */

class Main1{
    public static void main(String[] args){
        try{
            URL url=new URL("https://github.com/Shivam1097");
            
            // Using this class, we can find information of any HTTP URL such as header information, status code, response code .
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();

            for(int i=1;i<=8;i++){
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch(Exception e){System.out.println(e);}
    }
}
//OUTPUT
/*
Server = GitHub.com
Date = Tue, 02 Apr 2019 19:04:44 GMT
Content-Type = text/html; charset=utf-8
Transfer-Encoding = chunked
Status = 200 OK
Vary = X-Requested-With
ETag = W/"f699b795ed0925c59abafb30b059eda1"
Cache-Control = max-age=0, private, must-revalidate
 */