package com.shivam;

import com.shivam.model.Book;
import com.shivam.model.DataSource;
import com.shivam.model.Students;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource=new DataSource();
        if (!dataSource.open()){
            System.out.println("COULDN'T OPEN DATA SOURCE");
            return;
        }

        List<Students> students=dataSource.queryCSEbranhStudent();
        for(Students student : students){
            System.out.println("Name : "+student.getName()+"\tRoll No : "+student.getROLLNO()
                                +"\tBranch : "+student.getBranch());
        }

        System.out.println();
        List<Book> books=dataSource.queryBookIssuedToStudentStartsWith_S();
        for(Book book : books){
            System.out.println("Title : "+book.getTitle()+"\t , Author : "+book.getAuthor());
        }

        System.out.println();
        List<Students> students1=dataSource.queryStudentIssuedBookOf_TATA_MAGROW_pub();
        for(Students student:students1){
            System.out.println("NAME : "+student.getName());
        }


        System.out.println();
        List<Book> books1=dataSource.queryBookIssuedBefore_23_10_2015();
        for(Book book: books1){
            System.out.println("Title : "+book.getTitle());
        }

        System.out.println();
        dataSource.queryStudent_and_Title_of_issuedBook_author_JAMES_GOSSLING();

        dataSource.close();

    }
}
