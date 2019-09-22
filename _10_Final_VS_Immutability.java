package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _10_Final_VS_Immutability {

    public static void main(String[] args) {


        // Suppose we are asked to make StringBuffer object Immutable, then we may try to declare it as final, BUT it
        // won't make it Immutable. See following example ->

        final StringBuffer sb = new StringBuffer("Shivam");

        // We can still append the string to sb.
        sb.append(" Shukla");

        System.out.println(sb);             //Shivam Shukla

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Declaring a variable as FINAL means we can't reassign that reference variable to NEW OBJECT!!!!!!!!!!!!!!!!
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // If we try to reassign sb to another object, then it will give CTE.
        // sb = new StringBuffer("Shivam Shukla");             // CE: Can't assign value to the final variable!


        // So if we don't want a VARIABLE to be reassigned, go for FINAL.

        // If we can't make changes to the existing OBJECT, then it is IMMUTABLE.


        // Immutability related to object while final is related to reference variable!

        // We CAN'T make SB as IMMUTABLE, because internally, the SB methods are implemented to provide Mutable nature.
        // To make it immutable, we have to internally change all of it's methods which is not possible.

    }

}
