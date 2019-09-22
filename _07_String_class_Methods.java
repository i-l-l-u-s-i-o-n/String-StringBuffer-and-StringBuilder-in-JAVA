package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _07_String_class_Methods {

    public static void main(String[] args) {

        // Some most commonly used String class methods are ->

        //////////////////////////////////////////////////////////////////////////////////////////////////////

        // Calling these methods will CREATE THE NEW OBJECT IN HEAP area, if it is not present in the heap, else
        // just assigns the reference to the existing object.

        // In case of string literals(such as s.concat("This is a literal")), a new object is created on SCP, if not existing already
        // else only the reference will be assigned to same object.

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        String s =new String("Shivam");

        //1) public char charAt(int index);
        System.out.println(s.charAt(3));            // v

        // System.out.println(s.charAt(30));        // RE : StringIndexOutOfBound



        //2) public String concat(String s);
        s = s.concat(" Shukla");
        System.out.println(s);                      // Shivam Shukla

        // We can also use + operator to concatenate 2 strings.



        //3) public boolean equals(Object o);                               It is overridden in String class and compares the content!!!!
        System.out.println(s.equals("shivam shukla"));  // false            As it also compare cases!


        //4) public boolean equalsIgnoreCase(Object o);
        System.out.println(s.equalsIgnoreCase("shivam shukla"));  // true             As it ignores the case.


        // 5) public  boolean isEmpty();
        System.out.println(s.isEmpty());                             // false    As no. of characters is not 0.


        // 6) public int length();
        System.out.println(s.length());                             // 13

        // In case of arrays -> to check the length of of array, we use the length VARIABLE i.e.  arr.length;


        // 7) public String replace(char oldChar, char newChar);
        System.out.println(s.replace(' ','_'));     // Shivam_Shukla


        // 8) public String substring(int begin);                   // Returns string from begin index to end of string.
        System.out.println(s.substring(7));                         // Shukla


        // 9) public String substring(int begin, int end);          // Returns string from begin index to end-1 index.
        System.out.println(s.substring(4,6));                       // am


        // 10) public int indexOf(char c);
        System.out.println(s.indexOf('S'));                         // 0   In case of duplicates, returns 1st matching char index.
        System.out.println(s.indexOf('z'));                         // -1  In case of no matching char.


        // 11) public int lastIndexOf(char c);
        System.out.println(s.lastIndexOf('S'));                 // 7   Returns last occurred char index in case of duplicates.


        // 12) public String toLowerCase();
        System.out.println(s.toLowerCase());                        // shivam shukla


        // 13) public String toUpperCase();
        System.out.println(s.toUpperCase());                        // SHIVAM SHUKLA


        // 14) public String trim();                                Removes space present at beginning or end of the String.
        System.out.println("  Shivam  ".trim());                    //Shivam
        System.out.println(s.trim());                               // Shivam Shukla   Doesn't remove blank spaces from the middle.

    }
}
