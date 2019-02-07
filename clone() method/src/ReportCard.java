/**
 * created by Shivam on 07-02-2019.
 */
class ReportCard implements Cloneable {

    int marks;

    ReportCard(int marks){
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "marks=" + marks;
    }
}
