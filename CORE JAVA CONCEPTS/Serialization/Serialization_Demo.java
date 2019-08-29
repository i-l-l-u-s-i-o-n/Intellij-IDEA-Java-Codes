import java.io.*;

/**
 * created by Shivam on 29-08-2019.
 */


// The process of saving state of an object to file.
// The process of converting object from java specific form to file supported form or network supported form is called serialization.
class Dog implements Serializable{

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Serialization_Demo {


    public static void main(String[] args) throws Exception {


        Dog d1 = new Dog("Rusty", 5);
        System.out.println(d1.name+"    "+d1.age);

        // To save object in file, we do serialization->
        FileOutputStream fos = new FileOutputStream("dogs.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        System.out.println("Object Written!");

        // To read object from file, we do deserialization.
        FileInputStream fis= new FileInputStream("dogs.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println("Object Read!");

        System.out.println(d2.name+"    "+d2.age);



    }

}
