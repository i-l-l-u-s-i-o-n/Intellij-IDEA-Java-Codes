

/**
 * created by Shivam on 07-02-2019.
 */
public class Main{
    public static void main(String[] args) {
        try{

            ReportCard reportCard=new ReportCard(95);
            Student s=new Student("Shivam",101,reportCard);
            Student s1=(Student)s.clone();
            System.out.println("s : "+s);
            System.out.println("s1 : "+s1);

//            OUTPUT
//            s : Student{name='Shivam', roll_no=101, marks=95}
//            s1 : Student{name='Shivam', roll_no=101, marks=95}



            s1.name="SHIVAM";
            s1.roll_no=102;

            // IN SHALLOW cloning marks in the reportCard object will also be changed in original object 's' .
            // In DEEP cloning marks will not change for the reportCard object.
            s1.report.marks=98;
//
//            System.out.println("\nShallow cloning : \n");
//            System.out.println("s : "+s);
//            System.out.println("s1 : "+s1);


//            OUTPUT->
//            Shallow cloning :
//
//            s : Student{name='Shivam', roll_no=101, marks=98}
//            s1 : Student{name='SHIVAM', roll_no=102, marks=98}


            System.out.println("\nDEEP cloning : \n");
            System.out.println("s : "+s);
            System.out.println("s1 : "+s1);



            // DEEP cloning can be performed by overriding clone() as per to copy the reference variable.

//            OUTPUT->
//            DEEP cloning :
//
//            s : Student{name='Shivam', roll_no=101, marks=95}
//            s1 : Student{name='SHIVAM', roll_no=102, marks=98}



        }catch (CloneNotSupportedException e){

            System.out.println(e.getMessage());
        }
    }
}
