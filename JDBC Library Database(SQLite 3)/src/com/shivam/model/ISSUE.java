package com.shivam.model;



public class ISSUE {

    private int Issued_BOOK_ISBN;
    private String Date_of_ISSUE;
    private int Issue_Rollno;

    public int getIssued_BOOK_ISBN() {
        return Issued_BOOK_ISBN;
    }

    public void setIssued_BOOK_ISBN(int issued_BOOK_ISBN) {
        Issued_BOOK_ISBN = issued_BOOK_ISBN;
    }

    public String getDate_of_ISSUE() {
        return Date_of_ISSUE;
    }

    public void setDate_of_ISSUE(String date_of_ISSUE) {
        Date_of_ISSUE = date_of_ISSUE;
    }

    public int getIssue_Rollno() {
        return Issue_Rollno;
    }

    public void setIssue_Rollno(int issue_Rollno) {
        Issue_Rollno = issue_Rollno;
    }
}
