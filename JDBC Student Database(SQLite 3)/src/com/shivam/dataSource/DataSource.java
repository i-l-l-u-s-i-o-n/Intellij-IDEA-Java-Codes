package com.shivam.dataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static final String CONNECTION_STRING="jdbc:sqlite:D:\\Databases\\Students_Marks.db";

    public static final String TABLE_STUDENT="Student";

    public static final String COLUMN_STUDENT_NAME="name";
    public static final String COLUMN_STUDENT_ROLLNO="rollno";
    public static final String COLUMN_STUDENT_DEPT_ID="dept_id";
    public static final String COLUMN_MARKS="marks";

    public static final String CREATE_STUDENT = "CREATE TABLE IF NOT EXISTS "+TABLE_STUDENT+"( "+
                                                COLUMN_STUDENT_ROLLNO+" INTEGER PRIMARY KEY ,"+
                                                COLUMN_STUDENT_NAME+" TEXT NOT NULL , "+
                                                COLUMN_STUDENT_DEPT_ID+" INTEGER ,"+
                                                COLUMN_MARKS+" INTEGER )";



    public static final String TABLE_DEPT="department";

    public static final String COLUMN_DEPT_ID="_id";
    public static final String COLUMN_DEPT_NAME="name";
    public static final String COLUMN_HOD="hod";


    public static final String CREATE_DEPARTMENT = "CREATE TABLE IF NOT EXISTS "+TABLE_DEPT+"( "+
                                                    COLUMN_DEPT_ID+" INTEGER , "+
                                                    COLUMN_DEPT_NAME+" TEXT NOT NULL ,"+
                                                    COLUMN_HOD+" TEXT )";

    public static final String INSERT_STUDENT="INSERT INTO "+TABLE_STUDENT+" VALUES (?, ?, ?,?)";
    public static final String INSERT_DEPARTMENT="INSERT INTO "+TABLE_DEPT+" VALUES (?, ?, ?)";
    public static final String QUERY_STUDENT="SELECT * FROM "+TABLE_STUDENT;
    public static final String QUERY_DEPARTMENT="SELECT * FROM "+TABLE_DEPT;


    private Connection conn;
    PreparedStatement create_student;
    PreparedStatement create_department;
    PreparedStatement insert_student;
    PreparedStatement insert_department;

    public void open(){
        try {
            conn=DriverManager.getConnection(CONNECTION_STRING);
            create_student=conn.prepareStatement(CREATE_STUDENT);
            create_department=conn.prepareStatement(CREATE_DEPARTMENT);
            insert_student=conn.prepareStatement(INSERT_STUDENT);
            insert_department=conn.prepareStatement(INSERT_DEPARTMENT);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void close(){
        try {
            if (create_student!=null){
                create_student.close();
            }
            if (create_department!=null){
                create_department.close();
            }
            if(insert_student!=null){
                insert_student.close();
            }
            if(insert_department!=null){
                insert_department.close();
            }
            if (conn!=null){
                conn.close();
            }
        }catch (SQLException e){
            System.out.println("Oh .... "+e.getMessage());
        }
    }

    public void create_table_student(){
        try {
            create_student.execute();
            System.out.println("\nStudent table created .......");
        }catch (SQLException e){
            System.out.println("Oh..."+e.getMessage());
        }
    }

    public void create_table_dept(){
        try {
            create_department.execute();
            System.out.println("Department Table created ...... ");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void insert_Student(String name,long rollno,int _id,int marks){
        try{
            insert_student.setLong(1,rollno);
            insert_student.setString(2,name);
            insert_student.setInt(3,_id);
            insert_student.setInt(4,marks);
            insert_student.execute();
            System.out.println("Record successfully inserted...........!");
        }catch (SQLException e){
            System.out.println(e.getMessage()+"Couldn't insert record.......!!!!!!!!!!");
            e.printStackTrace();
        }
    }

    public void insert_Department(String name,String hod,int _id){
        try {
            insert_department.setInt(1,_id);
            insert_department.setString(2,name);
            insert_department.setString(3,hod);
            insert_department.execute();
            System.out.println("Record inserted successfully......!");
        }catch (SQLException e){
            System.out.println(e.getMessage()+"Couldn't insert record.......!!!!!!!!!!");
            e.printStackTrace();
        }
    }
    public List<Student> query_Student(){
        try {
            Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery(QUERY_STUDENT);
            List<Student> students=new ArrayList<>();
            while(resultSet.next()){
                Student student=new Student();
                student.setName(resultSet.getString(2));
                student.setMarks(resultSet.getInt(4));
                student.setRollNo(resultSet.getLong(1));
                student.setStu_dept_id(resultSet.getInt(3));
                students.add(student);
            }

            statement.close();
            return students;
        }catch (SQLException e){
            System.out.println(e.getMessage()+"Can't get record...........!!!!!!");
            e.printStackTrace();
            return null;

        }
    }
}

































