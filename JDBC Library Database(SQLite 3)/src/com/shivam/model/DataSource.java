package com.shivam.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME = "Library.db";

    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Databases\\" + DB_NAME;

    public static final String TABLE_STUDENT = "student";

    public static final String COLUMN_STUDENT_ROLLNO = "RollNo";
    public static final String COLUMN_STUDENT_NAME = "name";
    public static final String COLUMN_STUDENT_BRANCH = "branch";

    public static final String TABLE_BOOK = "book";

    public static final String COLUMN_ISBN = "ISBN";
    public static final String COLUMN_TITLE = "Title";
    public static final String COLUMN_AUTHOR = "Author";
    public static final String COLUMN_PUBLISHER = "Publisher";

    public static final String TABLE_ISSUE = "Issue";

    public static final String COLUMN_ISSUE_ROLLNO = "RollNo";
    public static final String COLUMN_ISSUE_ISBN = "ISBN";
    public static final String COLUMN_DATE_OF_ISSUE = "Date_of_issue";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }


    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Students> queryCSEbranhStudent(){
        try (Statement statement=conn.createStatement();
             ResultSet resultSet=statement.executeQuery("SELECT * FROM "+TABLE_STUDENT
                            +" WHERE "+COLUMN_STUDENT_BRANCH+"='CSE'")){

            List<Students > students=new ArrayList<>();

            while(resultSet.next()){
                Students student=new Students();
                student.setROLLNO(resultSet.getInt(COLUMN_STUDENT_ROLLNO));
                student.setName(resultSet.getString(COLUMN_STUDENT_NAME));
                student.setBranch(resultSet.getString(COLUMN_STUDENT_BRANCH));
                students.add(student);
            }
            return students;

        }catch (SQLException e){
            System.out.println("Something went wrong : "+e.getMessage() );
            e.printStackTrace();
            return null;
        }
    }



    public List<Book> queryBookIssuedToStudentStartsWith_S(){
        try(Statement statement=conn.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM Book INNER JOIN Issue ON Book.ISBN=Issue.ISBN" +
                        " INNER JOIN Student ON Student.RollNo=Issue.RollNo WHERE Student.Name LIKE 'S%' GROUP BY Title")){

            List<Book> books=new ArrayList<>();

            while (resultSet.next()){
                Book book=new Book();
                book.setAuthor(resultSet.getString(3));
                book.setISBN(resultSet.getInt(1));
                book.setTitle(resultSet.getString(2));
                book.setPublisher(resultSet.getString(4));

                books.add(book);
            }
            return books;

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Students> queryStudentIssuedBookOf_TATA_MAGROW_pub() {

        try (Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT "+COLUMN_STUDENT_NAME+" FROM " + TABLE_ISSUE +
                     " INNER JOIN " + TABLE_BOOK + " ON " + TABLE_ISSUE + "." + COLUMN_ISSUE_ISBN +
                     "=" + TABLE_BOOK + "." + COLUMN_ISBN + " INNER JOIN " + TABLE_STUDENT + " ON " +
                     TABLE_STUDENT + "." + COLUMN_STUDENT_ROLLNO + "=" + TABLE_ISSUE + "." + COLUMN_ISSUE_ROLLNO +
                     " WHERE " + TABLE_BOOK + "." + COLUMN_PUBLISHER + "='TATA MAGROW'")){


            List<Students> students=new ArrayList<>();
            while(resultSet.next()){

                Students student=new Students();
                student.setName(resultSet.getString(1));
                students.add(student);
            }
            return students;

        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }


    public List<Book> queryBookIssuedBefore_23_10_2015(){
        try (Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT "+COLUMN_TITLE+" FROM " + TABLE_ISSUE +
                    " INNER JOIN " + TABLE_BOOK + " ON " + TABLE_ISSUE + "." + COLUMN_ISSUE_ISBN +
                    "=" + TABLE_BOOK + "." + COLUMN_ISBN +
                    " WHERE " +COLUMN_DATE_OF_ISSUE+"<'2015-10-23 00:00:00'")){

            List<Book> books=new ArrayList<>();
            while (resultSet.next()){
                Book book=new Book();
                book.setTitle(resultSet.getString(COLUMN_TITLE));
                books.add(book);
            }
            return books;

        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public void queryStudent_and_Title_of_issuedBook_author_JAMES_GOSSLING() {

        try (Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT " + COLUMN_STUDENT_NAME + "," + COLUMN_TITLE
                     + "," + COLUMN_AUTHOR + " FROM " + TABLE_ISSUE +
                     " INNER JOIN " + TABLE_BOOK + " ON " + TABLE_ISSUE + "." + COLUMN_ISSUE_ISBN +
                     "=" + TABLE_BOOK + "." + COLUMN_ISBN + " INNER JOIN " + TABLE_STUDENT + " ON " +
                     TABLE_STUDENT + "." + COLUMN_STUDENT_ROLLNO + "=" + TABLE_ISSUE + "." + COLUMN_ISSUE_ROLLNO +
                     " WHERE " + TABLE_BOOK + "." + COLUMN_AUTHOR + "='JAMES GOSSLING'")) {

            List<String> results = new ArrayList<>();
            while (resultSet.next()) {
                System.out.println("Name : " + resultSet.getString(1)
                        + "\t\t Title : " + resultSet.getString(2)
                        + "\t\t Author : " + resultSet.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
