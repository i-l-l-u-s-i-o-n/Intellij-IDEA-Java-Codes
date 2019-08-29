import java.io.*;

/**
 * created by Shivam on 29-08-2019.
 */


// Suppose our class has some sensitive data which we don't want to store in a file.
// So we can use transient modifier with variable which will allow JVM to ignore the value of variable and store the default value to the file.

class Account implements Serializable{

    String username= "Shivam";
    // password and pin will be stored with default value i.e null and 0.
    transient String password = "hello";
    transient private int pin = 1234;
    int acc_no =4044;

    public int getPin() {
        return pin;
    }
}

public class Transient_Keyword {

    public static void main(String[] args) throws Exception {

        Account a1 =new Account();
        System.out.println(a1.username + "  "+ a1.password + "  "+ a1.getPin()+ "  "+ a1.acc_no);

        // Writing object
        FileOutputStream fos = new FileOutputStream("accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        System.out.println("Object Written!");

        // Reading Object.
        FileInputStream fis= new FileInputStream("accounts.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2= (Account)ois.readObject();

        System.out.println("Object Read!");

        System.out.println(a2.username+"  "+ a2.password+ "  "+ a2.getPin()+ "  "+a2.acc_no);
    }
}

/*
OUTPUT-

Shivam  hello  1234  4044
Object Written!
Object Read!
Shivam  null  0  4044
 */
