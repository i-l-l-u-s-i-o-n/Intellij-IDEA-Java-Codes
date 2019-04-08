package com.company;

import com.company.dataSource.DataSource;
import com.company.dataSource.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource =new DataSource();

        dataSource.open();
        dataSource.create_table_student();
        dataSource.create_table_dept();



        List<Student> students=dataSource.query_Student();
        if(students.isEmpty()){
            System.out.println("No records....");
        }else {
            for(Student s:students){
                System.out.println("Name : "+s.getName()+"\n"+
                                    "Roll No : "+s.getRollNo()+"\n"+
                                    "Marks : "+s.getMarks()+"\n"+
                                    "Department ID : "+s.getStu_dept_id());
            }
        }
        dataSource.close();


    }
}




























