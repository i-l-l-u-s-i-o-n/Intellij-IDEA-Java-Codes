package generics;

import java.util.ArrayList;

/**
 * created by Shivam on 19-09-2019.
 */


public class _02_Type_Safety {

    public static void main(String[] args) {

        // Collection can me made type safe using Generics concept!

        // Without Generics
        ArrayList arrayList = new ArrayList();

        // We can add any type of element to list!! Hence it is not Type safe.

        // But using generics, it can be made type safe.
        ArrayList<String> strings = new ArrayList<>();

        // Strings Al will store only String Objects and we try to insert any other object, it will give CTE.
    }
}
