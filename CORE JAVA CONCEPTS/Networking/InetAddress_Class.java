
/**
 * created by Shivam on 02-04-2019.
 */

class Main1{

    public static void main(String[] args) {

        try{

            InetAddress inet=InetAddress.getByName("localhost");
            //              OR
//            InetAddress inet=InetAddress.getByName("127.0.0.1");


            System.out.println("Host name: "+inet.getHostName());
            System.out.println("Host name: "+inet.getCanonicalHostName());
            System.out.println("IP address : "+inet.getHostAddress());
            



        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
//OUTPUT
/*
Host name: localhost
Host name: 127.0.0.1
IP address : 127.0.0.1
 */
