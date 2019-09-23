package enumeration;

/**
 * created by Shivam on 23-09-2019.
 */

// Since every enum constant is an object of enum type, so we can also define constructors inside enum.

// Enum constructor will be executed separately for every enum constant at the time of enum class loading automatically.
// because all objects(constants) are static and they must be created at time of class loading.

enum Company{

    // enum constants are Object.
    TCS, ACCENTURE, COGNIZANT, WIPRO ;

    // public is not allowed. enum constructors are implicitly PRIVATE.
    // because only enum constant specified in the enum will use this constructor internally and we are not allowed to create
    // enum object explicitly!

    Company(){
        System.out.println("Company enum constructor!");
    }

}

public class _06_enum_VS_constructors {


    public static void main(String[] args) {

        Company company = Company.TCS;

        // Since all enum constants are static, so they must be created at the time of class loading.
        // Although we are creating only 1 object, but constructor will be called 4 times because there are 4 enum constants.

        // if we comment line-> Company c = Company.TCS, no constructor will be called and hence no output!!!!!


        /*
        Company enum constructor!
        Company enum constructor!
        Company enum constructor!
        Company enum constructor!
         */


        // We can't create enum object as follows ->
        // Company c =new Company();
        // Because here, we are misusing the enum syntax!
        // When we declare the constants in our enum, it will implicitly create the enum type object with the name of Constant!.
        // So why to explicitly use new keyword to create constructor......


    }

}

