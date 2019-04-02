
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * created by Shivam on 02-04-2019.
 */


// First run the receiver program then sender to see the output on receiver's console.
class Receiver{
    public static void main(String[] args) {

//        DatagramSocket represents a connection-less socket for sending and receiving datagram packets.
//        Socket is basically IP address and PORT together.
       try {

           DatagramSocket datagramSocket=new DatagramSocket(1234);
           byte[] b=new byte[1024];

           DatagramPacket datagramPacket=new DatagramPacket(b,1024);
           datagramSocket.receive(datagramPacket);  // receiving datagram packet.

           String message=new String(datagramPacket.getData(),0,datagramPacket.getLength());
           System.out.println(message);

       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}

//OUTPUT
/*
This is a message!
 */