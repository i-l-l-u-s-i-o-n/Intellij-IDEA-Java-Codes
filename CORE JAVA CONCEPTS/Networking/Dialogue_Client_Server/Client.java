import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * created by Shivam on 02-04-2019.
 */
public class Client {

    public static void main(String[] args) {
        try {


            //After the server is waiting, a client instantiates a Socket object, specifying
            // the server name and the port number to connect to.
            Socket s=new Socket("localhost",6666);
			
			  // In case to communicate with different machine, we have to specify the IP address of that machine.
            //Socket s1=new Socket("10.23.1.22",3333);


            DataInputStream din =new DataInputStream(s.getInputStream());

            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String message_received="", message_sent="";
            while (!message_received.equals("stop")){

                message_sent=br.readLine();
                dout.writeUTF(message_sent);
                dout.flush();

                message_received=din.readUTF();
                System.out.println("Server says : "+message_received);

            }
            dout.close();
            s.close();


        }catch (Exception e){
			System.out.println(e.getMessage());
        }
    }
}
