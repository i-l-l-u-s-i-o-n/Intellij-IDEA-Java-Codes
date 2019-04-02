
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * created by Shivam on 03-04-2019.
 */
public class Sender {

    public static void main(String[] args) {

        try {

            DatagramSocket datagramSocket=new DatagramSocket();
            String message="This is a message!";

            InetAddress inet=InetAddress.getByName("127.0.0.1");
            DatagramPacket datagramPacket=new DatagramPacket(message.getBytes(),message.length(),inet,1234);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
