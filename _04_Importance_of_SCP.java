package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _04_Importance_of_SCP {

    public static void main(String[] args) {


        // String is most used Object in JAVA.

        // If any String object is repeatedly required, then it is not recommended to create separate object.
        // In SCP single object can be referenced with multiple references to improve performance and memory utilization.
        // So if one object is required multiple time, then instead of creating new object in Heap, a single object can be referenced with MULTIPLE references.

        // Example -> Suppose in Online Voting Application, there is a form which requires ask for several fields such as Name, City (All are string),etc......
        // Now suppose there are 1 crore people from Delhi, so instead of creating 1 crore object for every person who lives in Delhi, Just create 1 object "Delhi"
        // and then assign Multiple references to it and it is only possible in SCP!!!!!!!!!

        // BUT what is disadvantage of this??????????

            // Suppose 1 user wants to change it's city and updates its account information, and changes its city from Delhi to Lucknow.
            // Now since multiple references are pointing to same Object "Delhi", so any changes made by any reference will cause the change for all other references.

        // How JAVA People Overcame it -?

            // SUN People made the STRING CLASS IMMUTABLE!!!!!!!!!!!!!!!!!!!!!!!
            // So now using the reference, on cannot make changes to existing object.
            // It he tries to do so, a new Object will be created !!!!!

    }


}
