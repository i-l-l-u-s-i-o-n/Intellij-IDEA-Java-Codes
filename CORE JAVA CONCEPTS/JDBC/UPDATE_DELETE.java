package com.shivam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * created by Shivam on 06-04-2019.
 */
public class UPDATE_DELETE {

    public static void main(String[] args) {

        Connection conn=null;

        Statement statement=null;
        ResultSet resultSet=null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn= DriverManager.getConnection("jdbc:mysql://localhost/test","root","vision22@");

            statement=conn.createStatement();

            // SQL for UPDATING a record
            String UPDATE_RECORD="UPDATE Student SET Marks=90 WHERE Name='Shivam Shukla'";




            statement.executeUpdate(UPDATE_RECORD);
            statement.execute("SELECT * FROM Student");

            resultSet=statement.getResultSet();

            while (resultSet.next()){

                System.out.println("RollNo : "+resultSet.getString(1)+
                                    "\nName : "+resultSet.getString("Name")+
                                    "\nMarks : "+resultSet.getString(3)+
                                    "\nGrade : "+resultSet.getString(4));

            }








        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
// OUTPUT ->

/*

RollNo : 78
Name : Shivam Shukla
Marks : 90
Grade : A

 */