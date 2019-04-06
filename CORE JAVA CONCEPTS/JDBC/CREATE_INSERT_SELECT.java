package com.shivam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * created by Shivam on 06-04-2019.
 */
public class CREATE_INSERT_SELECT {


    public static void main(String[] args) {



        Connection conn=null;
        Statement statement=null;
        ResultSet resultSet=null;


        try {
            String name= "root";
            String pass="1234";
            String url="jdbc:mysql://localhost/test";

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn= DriverManager.getConnection(url,name,pass);

            // Initialising statement instance so as to perform various SQL operations and  queries.
            statement=conn.createStatement();


            // Writing sql for creating table Student.
            String CREATE_TABLE="Create table IF NOT EXISTS Student(" +
                                    "RollNo INTEGER PRIMARY KEY,"+
                                    "Name varchar(30) NOT NULL,"+
                                    "Marks INTEGER,"+
                                    "Grade varchar(2));";



            int RollNo=78;
            String Name="Shivam Shukla";
            int Marks=88;
            String Grade="A";

            // Writing SQL for inserting data into Student table.
            String INSERT_RECORD="INSERT into Student values("+
                                  RollNo+",'"+Name+"',"+Marks+",'"+Grade+"');";


            // Writing SQL for SELECT operation.

            String SELECT_ALL="SELECT * from Student";


            // Now we can execute our SQL statements using statement.execute().
            statement.execute(CREATE_TABLE);   // execute() returns true or false based on the execution of operation.

            //statement.executeUpdate(INSERT_RECORD);   // executeUpdate() returns the No. of rows affected by executing the statement.
                                                      // However we can also use execute() for inserting. and executeUpdate() for Creating table.

            resultSet= statement.executeQuery(SELECT_ALL);  // It returns all the records from Student table i.e executeQuery() returns ResultSet.
                                                            // We can also use execute()  and then use statement.getResultSet()  to get the records.

            // Fetching records from resultSet.
            while (resultSet.next()){

                // Retrieving data from columns in the table.
                int rollNo=resultSet.getInt(1);
                String name_student=resultSet.getString("Name");
                int marks=resultSet.getInt(3);
                String grade=resultSet.getString("Grade");


                System.out.println("\nRollNo : "+rollNo+
                                    "\nName : "+name_student+
                                    "\nMarks : "+marks+
                                    "\nGrade : "+grade);
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
Marks : 88
Grade : A

 */
