package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
class MyString{


    String msg;

    public MyString(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {

        // Example 1->

        // Creating empty SB object.
        StringBuffer sb = new StringBuffer(5);      // Setting capacity to hold 5 characters.

        String s ="";                                       // Creating empty String Object.


        if (sb.equals(s)){                                  // Object class equals() will be executed as it is not overridden in SB.
            System.out.println("sb.equals(s)");
        }
        else if(sb.toString().equals(s)){                   // String class equals() will be called as sb.toString() return String.
            System.out.println("sb.toString().equals(s)");
        }
        else{
            System.out.println("Not matched!!");
        }

        // output- > sb.toString().equals(s)


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Example 2 ->

        StringBuilder sb1 = new StringBuilder("Shivam");

        String s1 = sb1.toString();         // Creates a new object on HEAP.
        String s2 = sb1.toString();         // Creates another object on Heap.

        String s3 = s1;                     // pointing to s1.

        String s4 = new String(s1);         // As new is used, a separate object will be created on heap.

        String s5 = "Shivam";               // 1 Object will be created on SCP.

        System.out.println(s1==s2);         // false
        System.out.println(s1==s3);         // true
        System.out.println(s1==s4);         // false
        System.out.println(s1==s5);         // false


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Example 3 ->

        // We have to delete all the content of sb1->

        sb1.delete(0,sb1.length());

        System.out.println(sb1);


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Example 4 ->

        System.out.println("Hello "+ new StringBuilder("JAVA SE 8"));       // Hello JAVA SE 8
        System.out.println("Hello "+ new MyString("JAVA SE 8"));       // Hello stringStringBufferStringBuilder.MyString@48140564

        // In String, StringBuffer, StringBuilder, Wrapper class, and COLLECTION classes, toString() is OVERRIDDEN for meaningful
        // string representation.

        // To string method returns ->
        // className + " @ " +Integer.toHexString(hashcode());

        // In sop statement , we are concatenating Hello with new SB();
        // so new SB() will be equivalent to new SB().toString()
        // So Hello + JAVA SE 8 = Hello JAVA SE 8.

        // In 2nd sop statement, we are concatenating MyString class object.
        // So it will be equivalent to ->
        // Hello + new MyString().toString().
        // As to string is not overridden in MyString class , output will be ->
        // Hello stringStringBufferStringBuilder.MyString@48140564

    }
}
