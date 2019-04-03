import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * created by Shivam on 02-04-2019.
 */


// First run the Server program then Client to see the output on receiver's console.
class Server{
    public static void main(String[] args) {

        try {

            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();

            // For receiving data from client.
            DataInputStream din=new DataInputStream(s.getInputStream());

            // For sending data to client.
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // To read large input from network channel.

            String message_received="";
            String message_sent="";

            while (!message_received.equals("stop")){

                message_received=din.readUTF();
                System.out.println("Client says: "+message_received);

                message_sent=br.readLine();
                dout.writeUTF(message_sent);
                dout.flush();
            }

            din.close();
            s.close();
            ss.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
