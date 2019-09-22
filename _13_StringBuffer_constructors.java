package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _13_StringBuffer_constructors {

    public static void main(String[] args) {

        // In case od String the length and capacity are same.

        // In case of SB, both are different->
            // Length means how many characters are present.
            // Capacity means how may characters it can hold.

        // Empty SB object with default capacity as 16.
        StringBuffer sb = new StringBuffer();               // It can hold 16 characters, and after that it will increase it's capacity.

        // Capacity is increased as follows - >
            // New Capacity = (Current Capacity + 1) * 2;

        // It takes initial capacity as argument to create a big SB at beginning only.
        StringBuffer sb1 = new StringBuffer(100);


        // For creating SB object for given String
        StringBuffer sb2 = new StringBuffer(new String("This is a string!"));

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // For sb2 , the capacity will be ->
        // length of string + 16
        // i.e 17+16 = 33;
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(sb2.capacity());             // 33

    }
}
