/**
 * created by Shivam on 07-02-2019.
 */
class Student implements Cloneable {
    String name;
    int roll_no;
    ReportCard report;

    Student(String name,int roll_no,ReportCard reportCard){
        this.name=name;
        this.roll_no=roll_no;
        this.report=reportCard;
    }


    // For DEEP Cloning , We have to override clone() as follows->
    @Override
    protected Object clone() throws CloneNotSupportedException {
        String name=this.name;
        int roll_no=this.roll_no;
        ReportCard report=new ReportCard(this.report.marks); // Returning a new object rather than just a reference to old object, does deep cloning .
        return new Student(name,roll_no,report);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +", "+
                report +
                '}';
    }


}
