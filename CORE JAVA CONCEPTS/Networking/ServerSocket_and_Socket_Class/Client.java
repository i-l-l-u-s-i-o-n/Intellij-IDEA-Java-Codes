import java.io.DataOutputStream;
import java.net.Socket;

/**
 * created by Shivam on 02-04-2019.
 */
public class Client {

    public static void main(String[] args) {
        try {


            //After the server is waiting, a client instantiates a Socket object, specifying
            // the server name and the port number to connect to.
            Socket s=new Socket("localhost",5555);


            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            // Writing to dataOutputStream, which will be read using DataInputStream in the Server.java
            dout.writeUTF("Hi there !");
            dout.close();
            s.close();


        }catch (Exception e){

        }
    }
}
