package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _14_StringBuffer_Methods {

    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Shivam");


        // 1) public int length();
        System.out.println(sb.length());        // 6


        // 2) public int capacity();
        System.out.println(sb.capacity());      // 16


        // 3) public char charAt(int index);
        System.out.println(sb.charAt(3));       // v
        // System.out.println(sb.charAt(30));      // RE: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: index 30,length 6



        // 4) public void setCharAt(int index, char newChar);
        sb.setCharAt(3,'i');
        System.out.println(sb);                 // Shiiam
        sb.setCharAt(3,'v');


        // 5) public StringBuffer append(String s);
        // There are multiple append methods(overloaded)
        // We can pass int, float, byte, boolean, double,long.... etc as the parameter to append() .

        sb.append(" Shukla");
        sb.append("       ");
        sb.append(97);              // It will not put unicode value.
        sb.append(100);
        sb.append(true);
        sb.append(78.0);
        sb.append('A');

        System.out.println(sb);     // Shivam Shukla       97100true78.0A

        // Append will add data at the LAST.

        // To insert data at specified position, we use insert(), it is also overloaded.
        // 6) public StringBuffer insert(int index, String s).
        sb.insert(15,"This text is inserted in middle");
        sb.insert(47, true);

        System.out.println(sb);     // Shivam Shukla  This text is inserted in middle true    97100true78.0A


        // 7) public StringBuffer delete(int begin, int end) -> it deletes character from begin index to end -1 and returns remaining string.

        System.out.println(sb.delete(13,sb.length()));      // Shivam Shukla

        // 8) public StringBuffer deleteCharAt(int index); -> to delete single character;
        System.out.println(sb.deleteCharAt(6));             // ShivamShukla

        // 9) public SB reverse();  -> In string, we do not have reverse() , but in SB we have reverse() to reverse order of characters!
        System.out.println(sb.reverse());                   // alkuhSmavihS
        System.out.println(sb);                             // alkuhSmavihS
        sb.reverse();

        // All the changes will be permanent and reflect in original SB object.


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 10) public void setLength(int length);
        // Suppose we want only first 6 characters, so we can set the length of our existing SB object to 6.
        sb.setLength(6);
        System.out.println(sb);                             // Shivam

        // Now if we set length to 10, it will add SPACES to the existing string.
        sb.setLength(10);
        System.out.println(sb);                             // Shivam____

        sb.append("Shukla");
        System.out.println(sb);                             // Shivam    Shukla


        // 11) public void ensureCapacity(int capacity);
        // If we want to dynamically increase the capacity of SB, then we can use ensureCapacity();

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());              // 190
        // As already using the formula (CC +)*2, the capacity became 190, to 100 is already maintained.

        sb.ensureCapacity(200);
        System.out.println(sb.capacity());              // 382
        // To ensure 200 capacity it will increase the capacity using (190+1)*2  = 382.

        sb.ensureCapacity(1000);
        System.out.println(sb.capacity());              // 1000


        // 12) public void trimToSize();
        // To deallocate the memory which is useless.The capacity will be equal to the length of the String Contained!

        sb.trimToSize();
        System.out.println(sb.capacity());              // 16                   (Shivam    Shukla)









    }
}
