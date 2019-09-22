package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _08_Conclusions_on_String_Immutability {

    public static void main(String[] args) {

        String s1 =new String("shivam");
        // 2 object will be created. 1 on heap and 1 on SCP.

        String s2 = s1.toUpperCase();
        // 1 object will be created on Heap.

        String s3 = s1.toLowerCase();
        // No new Object will be created as s1 also points to shivam, so the content matched, s3 will be assigned to shivam.
        // Multiple references can also be assigned to String object on HEAP.
        // so s1 and s3 pointing to same object ( shivam ).

        System.out.println(s1==s2);         // false
        System.out.println(s1==s3);         // true


        //////////////////////////////////////////////////////////////////////////////////////

        String s11= "shivam";
        // 1 Object will be created on SCP.

        String s12= s11.toString();
        // Same as s11 , so no new object will be created.

        String s13 = s11.toLowerCase();
        // Same as s11, so no new object will be created.

        String s14 = s11.toUpperCase();
        // 1 new Object will be created on Heap.

        System.out.println(s11==s12);       // true
        System.out.println(s11==s13);       // true
        System.out.println(s11==s14);       // false

    }
}
