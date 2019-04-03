
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * created by Shivam on 02-04-2019.
 */


// First run the Server program then Client, to see the output on receiver's console.
class Srever{
    public static void main(String[] args) {

        try {

            //  The java.net.Socket class represents a socket, and the java.net.ServerSocket class
            //  provides a mechanism for the server program to listen for clients and establish connections with them.

            //The server instantiates a ServerSocket object, denoting which port number communication is to occur on.

            //The server invokes the accept() method of the ServerSocket class. This method waits until a client
            // connects to the server on the given port.

            //After the server is waiting, a client instantiates a Socket object, specifying the server name and
            // the port number to connect to.

            //The constructor of the Socket class attempts to connect the client to the specified server and the
            // port number. If communication is established, the client now has a Socket object capable of communicating with the server.

            //On the server side, the accept() method returns a reference to a new socket on the server that is
            // connected to the client's socket.

            ServerSocket ss=new ServerSocket(5555);

            // the accept() method returns a reference to a new socket on the server that is connected to the client's socket.
            Socket s=ss.accept();

            // Fetching message from client.
            DataInputStream din=new DataInputStream(s.getInputStream());

            // Reading from din object.
            String message=din.readUTF();

            System.out.println(message);

            din.close();
            s.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

//OUTPUT

/*
Hi there!
 */