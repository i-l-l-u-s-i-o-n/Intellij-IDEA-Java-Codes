package com.shivam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * created by Shivam on 07-04-2019.
 */
public class SHOW_TABLES {

    public static void main(String[] args) {

        Connection conn=null;

        Statement statement=null;
        ResultSet resultSet=null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn= DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");

            statement=conn.createStatement();



            // This SQL statement returns the Tables present in test database.
            statement.execute("show tables;");

            resultSet=statement.getResultSet();

            while (resultSet.next()){

                System.out.println("Tables : " + resultSet.getString(1));

            }




        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (resultSet!=null){
                    resultSet.close();
                }
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
