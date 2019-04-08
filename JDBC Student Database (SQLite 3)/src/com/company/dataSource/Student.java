package com.company.dataSource;

public class Student {
    private String name;
    private long RollNo;
    private int stu_dept_id;
    private int marks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNo() {
        return RollNo;
    }

    public void setRollNo(long rollNo) {
        RollNo = rollNo;
    }

    public int getStu_dept_id() {
        return stu_dept_id;
    }

    public void setStu_dept_id(int stu_dept_id) {
        this.stu_dept_id = stu_dept_id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
