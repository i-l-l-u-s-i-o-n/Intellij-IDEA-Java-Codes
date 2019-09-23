package enumeration;

import java.util.Arrays;

/**
 * created by Shivam on 23-09-2019.
 */
enum Month{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;   // ; is optional at the end!
}

public class _04_Enum_class_methods {

    public static void main(String[] args) {


        // 1) values(); -> to get all values present inside enum. Return type is enumType array.
        // THIS METHOD IS NOT PRESENT IN Enum CLASS, It is provided by enum keyword itself!!!!!!!!!!!!!!!!!!!!!!!

        // For Month enum, the return type will be Month[].

        Month[] months = Month.values();

        System.out.println(Arrays.toString(months));        // [JAN, FEB, MAR, APR, MAY, JUN, JULY, AUG, SEP, OCT, NOV, DEC]



        // 2) ordinal(); -> we can represent ORDER of enum constants using ordinal value i.e we can find the index (order)
        //                  enum constant using ordinal() which returns the ordinal value of that constant!
        // I is present in java.lang.Enum class.

        int orderOfOCT= Month.OCT.ordinal();

        System.out.println(orderOfOCT);                     // 9            (Similar as index in array!)

        for (Month m: months) {

            System.out.println(m+ " : "+ m.ordinal());
        }
        /*
        JAN : 0
        FEB : 1
        MAR : 2
        APR : 3
        MAY : 4
        JUN : 5
        JUL : 6
        AUG : 7
        SEP : 8
        OCT : 9
        NOV : 10
        DEC : 11
         */
        // Ordinal value is 0 based, i.e. starts from 0.

    }
}
