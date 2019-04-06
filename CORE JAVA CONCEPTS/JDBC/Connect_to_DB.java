package com.shivam;

import java.sql.*;

/**
 * created by Shivam on 06-04-2019.
 */


// JDBC is API which allows a JAVA program to communicate with the relational database.

// For communication, DRIVERS are required.

// There are 4 types of DRIVERS:

    // 1.   JDBC-ODBC Bridge Driver.
    // 2.   NATIVE API Driver (partially JAVA driver).
    // 3.   Network Protocol Driver.
    // 4.   Pure JAVA Driver OR THIN driver.

// java.sql package have some CLASSES and INTERFACES which provides us the methods to communicate with database.


// Some CLASSES         ->      DriverManager, ResultSet, SQLException, etc......
// Some INTERFACES      ->      Driver, Connection, Statement, etc ......

// Statements are of 3 types ->

    //1. Statement -> For executing simple sql statements.
    //2. Prepared Statement -> For executing PRECOMPILED SQL statements.
    //3. Callable Statement -> For executing a database stored procedure.

public class Connect_to_DB {

    public static void main(String[] args) {

        // Creating connection instance here so that it can be closed in finally block after use.
        Connection conn=null;

        try{

            // Name as registered with the MySQL sever.
            String name="root";

            //Password for that user.
            String pass="1234";

            // URL of the database server.
            String url="jdbc:mysql://localhost/test";     // Here test is our database name, and localhost is our server.

            //Loading the Driver class and creating new instance.
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // Establishing connection using DriverManager class..
            conn= DriverManager.getConnection(url,name,pass);

            System.out.println("Connected to Database !");





        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection closed !");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}
