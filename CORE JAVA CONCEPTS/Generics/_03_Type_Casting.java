package generics;

import java.util.ArrayList;

/**
 * created by Shivam on 19-09-2019.
 */
public class _03_Type_Casting {

    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();

        arrayList.add("Shivam");
        arrayList.add(new Integer(78));

        // Without generics, while retrieving the elements from AL, TYPE CASTING is MUST!
        String name= (String)arrayList.get(0);
        Integer num = (Integer)arrayList.get(1);

        // Using generics, we are not required to perform TYPE CASTING while retrieving elements from AL or any other collection.
        ArrayList<String> names =new ArrayList<>();

        // We have ensured that names AL will only store String type Objects!!!!
        // So no Type Casting!
        String n1= names.get(0);
        String n2= names.get(1);

    }
}
