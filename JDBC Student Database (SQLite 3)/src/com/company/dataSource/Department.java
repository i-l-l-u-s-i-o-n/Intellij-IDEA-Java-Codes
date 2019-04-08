package com.company.dataSource;

public class Department {
    int Dept_ID;
    String dept_name;
    String HOD;

    public int getDept_ID() {
        return Dept_ID;
    }

    public void setDept_ID(int dept_ID) {
        Dept_ID = dept_ID;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getHOD() {
        return HOD;
    }

    public void setHOD(String HOD) {
        this.HOD = HOD;
    }
}
