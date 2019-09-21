package stringStringBufferStringBuilder;

/**
 * created by Shivam on 21-09-2019.
 */
public class _01_Mutability_and_Immutability {

    public static void main(String[] args) {



        // IMMUTABILITY -->> Once we created an object, we are not allowed to make any change to that object !
        //                  if we try to do so, a new Object will be created.
        // String objects are IMMUTABLE .

        // Example ->

        String name = new String("Shivam");

        // Concatenating  Shukla to Shivam.
        name.concat("Shukla");

        // As string is IMMUTABLE, we can't make change to existing string object.

        System.out.println(name);       // Shivam

        // So instead of making change to name object, concat() returns a new String object!
        String fullName = name.concat(" Shukla");

        System.out.println(fullName);   // Shivam Shukla


        // MUTABILITY -->> We are allowed to make changes to the existing object.

        // StringBuffer and StringBuilder are MUTABLE.

        // Example ->
        StringBuffer sb = new StringBuffer("Shivam");

        // Appending Shukla to Shivam.
        sb.append(" Shukla");

        // As SB are Mutable, so we can make changes to the Existing Object.
        System.out.println(sb);             // Shivam Shukla



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // The difference between String and StringBuffer is that String is IMMUTABLE while StringBuffer is MUTABLE.
    }

}
