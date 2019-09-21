package innerClass;

/**
 * created by Shivam on 21-09-2019.
 */
public class _05_Normal_Java_Class_VS_Anonymous_InnerClass {

    public static void main(String[] args) {

        /////// SOME DIFFERENCES BETWEEN INNER CLASS(IC) AND NORMAL JAVA CLASSES (NJC)/////////////////////////////////////////


        // IC and NJC both can extend only 1 class at a time.

        // IC can implement ONLY 1 interface at a time. BUT NJC can implement multiple INTERFACES at a time!

        // IC can either implement or extend 1 interface or class respectively, BUR NJC can extend 1 class and Multiple interfaces simultaneously!!

        // IC can't have CONSTRUCTOR as it doesn't have NAME, but NJC have Constructors!!!!!!!!!!!

        // If requirement is standard and required several times, we should go for NJC, but if the requirement is temporary and required only once
        // (instant use) , then we should go for AIC.

        // Where AIC is best suitable ?????

            // IN GUI application, for Event Handling i.e assigning the Event Listeners to the Button as it is one time requirement.
            // Just we assign the evenListener to a button only once and whenever it will be clicked , the specified action will be performed.

            //            b1.addActionListener(new ActionListener(){
            //
            //                public void actionPerformed(ActionEvent e){
            //
            //                    Button b1 specific functionality will be defined here.
            //
            //                }
            //            });
    }
}
