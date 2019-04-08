package com.shivam;

import java.sql.*;
import java.util.Scanner;

/**
 * created by Shivam on 08-04-2019.
 */

// DIFFERENCE b/w Statement and PreparedStatement ->
    // In case of Statement, the query is not pre compiled,
        // i.e the query will be compiled EVERY TIME whenever we use statement.execute( "SQL_QUERY" ).
        // statement.execute( "SQL_QUERY" ). -> include compilation of SQL_Query and the execution.
        // If we have to execute the same query 10000 times, then using Statement will not be suitable, as
        // the query will be compiled and executed again and again.

    // In case of PreparedStatement, the query will be pre compiled.
        // i.e the query will be compiled only ONCE when we create the PreparedStatement object using ->conn.PrepareStatement( SQL_Query ).
        // Here the SQL_Query is passed as parameter.
        // preparedStatement.executeQuery( ). -> just include execution.
        // If we have to execute the same query 10000 times, then using PreparedStatement will be suitable, as
        // the query will compile ONLY ONCE, and only it has to be executed again and again.
        // So PreparedStatement provides us BETTER PERFORMANCE.

public class PREPARED_STATEMENT {

    public static void main(String[] args) {


        Connection conn=null;

        Statement statement=null;

        PreparedStatement preparedStatement=null;

        ResultSet resultSet=null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");


            // To create Statement object, we have to use conn.createStatement(), which requires no parameter.
            statement=conn.createStatement();


            // Compiling and Executing SQL query ->
            //statement.executeUpdate("INSERT into Student values (62,'Colt Steele',89,'A')");

            String name= new Scanner(System.in).nextLine();

            resultSet=statement.executeQuery("SELECT * FROM Student WHERE Name ='"+name +"';");
            while (resultSet.next()){
                System.out.println("\nRollNo : "+resultSet.getInt(1)+
                        "\nName : "+resultSet.getString(2)+
                        "\nMarks : "+resultSet.getInt(3)+
                        "\nGrade : "+resultSet.getString(4)+"\n");
            }

            // To Create PreparedStatement object, we have to use conn.PrepareStatement( SQL_Query ), which requires a SQL_Query as a parameter.
            // In creating a PreparedStatement Object, some background process takes place ->
                // The SQL_Query is first sent to the DATABASE, then the DB ENGINE will COMPILE it, and STORE it.
                // Then it RETURNS the COMPILED SQL_Query , which is then stored in the PreparedStatement Object.

            preparedStatement=conn.prepareStatement("SELECT * FROM Student WHERE Name = ? ");   // The query wil compile here only.

            // ? is placeholder.
            // We can use placeholder in PREPARED STATEMENT to PREVENT SQL INJECTION ATTACK .

            //==============================================================SQL INJECTION ======================================================||
            //                                                                                                                                  ||
            // SQL Injection Is when we take input of name from user ,he may enter ---- Shivam Shukla" or 1=1 or"                               ||
            // The Query will become ------                                                                                                     ||
            // Select * FROM Student WHERE title="Shivam Shukla" or 1=1 or ""                                                                   ||
            // as 1=1 return true so all the records will be fetched .                                                                          ||
            //                                                                                                                                  ||
            // To remove this problem we use PREPARED STATEMENTS which are precompiled sql statement. They are also used to improve performance ||
            //                                                                                                                                  ||
            // Using Prepared statement , the SQL will be ----                                                                                  ||
            // Select * FROM Student WHERE title="Shivam Shukla or 1=1 or ""                                                                    ||
            //                                                                                                                                  ||
            // The input will be treated as a SINGLE LITERAL not an individual SQL.                                                             ||                                                                 ||
            //==================================================================================================================================||

            // to set the value of placeholder ->
            preparedStatement.setString(1,new Scanner(System.in).nextLine());

            // Executing preparedStatement.
            resultSet=preparedStatement.executeQuery();


            while (resultSet.next()){
                System.out.println("\nRollNo : "+resultSet.getInt(1)+
                                    "\nName : "+resultSet.getString(2)+
                                    "\nMarks : "+resultSet.getInt(3)+
                                    "\nGrade : "+resultSet.getString(4)+"\n");
            }



        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
/*

// Using statement without Placeholder
// Input ->
Shivam Shukla' or 1=1 or '

// Output ->
RollNo : 58
Name : Andrew Russele
Marks : 80
Grade : B


RollNo : 62
Name : Colt Steele
Marks : 89
Grade : A


RollNo : 78
Name : Shivam Shukla
Marks : 91
Grade : A


RollNo : 80
Name : Tim Buchalka
Marks : 95
Grade : A


// Using PreparedStatement and Placeholder ->
// Input ->
Shivam Shukla' or 1=1 or '


// Output ->
no output.

Process finished with exit code 0

 */