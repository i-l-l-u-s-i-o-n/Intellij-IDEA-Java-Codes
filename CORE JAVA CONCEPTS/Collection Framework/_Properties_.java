package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * created by Shivam on 18-09-2019.
 */



// //////////// ////////////// PROPERTIES Class ///////////////////////////////////

    // It is CHILD CLASS of Hashtable.
    // It came in v1.0 hence a Legacy Class.

    // USE of PROPERTIES CLASS ->

        // In our program, if any thing which changes frequently like username, pass ,email, m.no etc, are not recommended to HARD CODE in our JAVA Program
        // because if there is any change, we must RECOMPILE, REBUILD and REDEPLOY our Application , sometimes SERVER Restart is also required.

        // So to overcome this problem, Such type of variable things are recommended to be defined in PROPERTIES FILE.

        // From that properties File, we have to read into JAVA program and use those properties.
        // Main advantage is if there is change in properties file, to reflect that change just redeployment is enough.
        //-------------------------------------------------------------------------------------------------------//
        // We can use JAVA Properties Object to hold Properties which are coming from Properties File.           //
        //-------------------------------------------------------------------------------------------------------//

    // Properties is also a KEY VALUE pair BUT both MUST BE STRING!!!!!!!!!!!!!!!!!!!!!!!


    // Some Methods ->

        // String getProperty(String pName);                    // Get the value of specified property name.
        // String setProperty(String pName, String pValue);     // Can't have duplicate name(keys), so returns the replaced value (same as put in map)
        // Enumeration propertyName();                          // Gives all properties name as Enumeration object.
        // void load(InputStream is);                           // To load properties from properties file to java Properties Object.
        // void store(OutputStream os,String comment);          //to store properties from java properties object into properties file.


public class _Properties_{

    public static void main(String[] args)  throws  Exception{

        // Creating Properties Object
        Properties properties =new Properties();

        // Using FOS and FIS for File reading Writing.
        FileInputStream fis = new FileInputStream("abc.properties");

        // Now loading the properties from file to Properties object.
        properties.load(fis);

        // Printing key value pairs.
        System.out.println(properties);    // {pass=1234, dbName=mysql, name=shivam}      Insertion order is not preserved!

        // Reading value of a property.
        String dataBaseName = properties.getProperty("dbName");

        System.out.println(dataBaseName);     // mysql

        // Adding new property
        properties.setProperty("NewProperty","NewValue");

        // Now we have to store the value to th abc.properties file.
        FileOutputStream fos =new FileOutputStream("abc.properties");
        properties.store(fos,"Added new property!");  // this comment 'Added new property' will be added to the properties file at top.

        System.out.println(properties);           // {pass=1234, dbName=mysql, name=shivam, NewProperty=NewValue}

        fis.close();
        fos.close();
     }
}
