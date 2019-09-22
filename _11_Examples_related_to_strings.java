package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _11_Examples_related_to_strings {

    public static void main(String[] args) {


        //////////////////////////////////////////////////////////////////////////////////////////////////////

        // Calling String class methods will CREATE THE NEW OBJECT IN HEAP area, if it is not present in the heap, else
        // just assigns the reference to the existing object.

        // In case of string literals(such as s.concat("This is a literal")), a new object is created on SCP, if not existing already
        // else only the reference will be assigned to same object.

        /////////////////////////////////////////////////////////////////////////////////////////////////////////


        // Example 1->

        String ta = "A";

        ta= ta.concat("B");

        String tb = "C";

        ta= ta.concat(tb);

        // As String objects are Immutable, we can't make changes to existing String object, if we try to do so, a new Object
        // will bew created.
        ta.replace('C','D');

        ta= ta.concat(tb);

        System.out.println(ta);                 // ABCC


        // Example 2->

        String s= " ";


        // As String objects are Immutable, we can't make changes to existing String object, if we try to do so, a new Object
        // will bew created.
        s.trim();           // We are not making change to s, rather it will return a new object.

        System.out.println(s.equals("") + "     "+ s.isEmpty());            // false     false
        // isEmpty() returns true, if no. of characters are 0 but here, s contains 1 character, i.e ' '(blank space).


        // Example 3->

        String s1 = "Shivam Shukla";

        System.out.println(s1.trim().length());         // 13       Trim doesn't remove space from middle of String.


        // Example 4 ->

        String s2 ="So many Strings!";

        System.out.println(s2.trim().indexOf(' '));             // 2
        System.out.println(s2.trim().lastIndexOf(' '));     // 7

        // Example 5 ->

        String s3 = "java";                         // Object created on SCP
        String s4 =new String("Java");      // Object created on Heap and SCP.

        String s5 = s3;                             // No object created.(Pointing to s3)

        if (s3.equals(s4)){                         // Case not matched
            System.out.println("s3.equals(s4)");
        }
        else if(s5==s4){                            // One is in heap and other is in SCP.
            System.out.println("s5==s4");
        }
        else if(s3.toLowerCase()==s4.toLowerCase()){        // s3.toLowerCase() creates a new object on Heap(Only string constants(literals) are put on SCP)
            System.out.println("s3.toLowerCase()==s4.toLowerCase()");
        }
        else if(s3.equalsIgnoreCase(s4)){               // It will ignore the cases!!!!!!!!
            System.out.println("s3.equalsIgnoreCase(s4)");
        }
        else{
            System.out.println("Not equal :( ");
        }

        // OUTPUT -> s3.equalsIgnoreCase(s4)







    }
}
