package stringStringBufferStringBuilder;

/**
 * created by Shivam on 21-09-2019.
 */
public class _03_Heap_and_String_Constant_Pool {

    public static void main(String[] args) {


        // String is the MOST USED object in any Java Program.
        // Consider following ->

        String s = new String("Shivam");

        // Here 2 OBJECTS will be created.( only in case of String Constant Literal)

            // 1st in the HEAP area and 's' will be assigned as a reference to it.
            // 2nd in STRING CONSTANT POOL (without reference 's') for re-usability in future.
            // In SCP, implicitly a reference variable is maintained by JVM.
            // The object created in SCP, is NOT AVAILABLE to GC.

        // Till version 1.6, SCP was in the Method Area of JVm or PERMGEN.

        // From v1.7, SCP was moved to HEAP area, to make SCP expandable in nature.(In Method area or PERMGEN, the SCP size was fixed).


        String s1 ="Shivam";

        // In this case ONLY 1 OBJECT wil be created in SCP area with reference s1,
        // BUT before creating Object in SCP, JVM will check if any object with content Shivam is available or not, if it
        // is already there, then it is going to use the SAME object.
        // If it is not there, then only it will create a new Object!



        // Example ->

        String s2 =new String("Shivam");
        String s3 =new String("Shivam");
        String s4 ="Shivam";
        String s5 ="Shivam";


        // In above 4 line ->
            // 2 Objects are created in HEAP area.
            // 1 object is created in SCP ( which is while creating object s2)!!!!!

        // On creating s3, JVM will create s3 on HEAP, and then in SCP it check the content with s3, if it is already there
        // it will not create new Object in SCP.

        // On creating s4, no object will be created on HEAP, JVM will check SCP for the content, if already there, it will reuse the object.
        // and assign the reference s4 to that object!

        // Same as above for s5.


        // Example ->

        String ss = new String("This ");

        ss.concat("will not be added");                 // as concat() return String object, so 2 object will also be created in Heap

        ss= ss.concat("is concatenated String");

        // Total 6 objects will be created ->
            // 3 in heap
            // 3 in SCP.  ("will not be added" and "is concatenated String" are String Literal, so for them also Object will be created in SCP.

        // But ss is assigned to concatenated String, so 2 object will be available for GC.


        // Example ->

        String ss1 = new String("Spring");

        ss1.concat("Fall");

        String ss2= ss1.concat("Winter");

        ss2.concat("Summer");

        System.out.println(ss1);            // Spring
        System.out.println(ss2);            // SpringWinter

        // Total 8 object will be created, 4 in heap and 4 in SCP.

        // Example ->

        String s11 = new String("You cannot change me");
        String s12 = new String("You cannot change me");
        System.out.println(s11==s12);                           // false

        String s13 = "You cannot change me";
        System.out.println(s11==s13);                           // false

        String s14 = "You cannot change me";
        System.out.println(s13==s14);                           // true


        String s15 = "You cannot "+"change me";
        // It is same as s14, because "You cannot " and "change me" both are string Constants, they are replaced by the concatenated
        // string at COMPILE TIME only. So it will become same as s14.
        System.out.println(s14==s15);                           // true


        String s16 = "You cannot ";
        // for above line, s16 object will be created in SCP.
        String s17 = s16+"change me";
        // Since there is one variable (s16), so the operation will be performed at runtime.
        // So "change me" object will be created in SCP, and then s17 will be created in head which point to the result of s16+"change me";
        System.out.println(s14==s17);                           // false

        final String s18 = "You cannot ";
        // As "You cannot " is already in SCP(s16 pointing to it), s18 will be assigned to it.
        String s19 = s18+"change me";
        // Since s18 is FINAL, it will be replaced by its value at compile time, s19 will become same as s15  ("You cannot change me").
        System.out.println(s14==s19);                           // true


    }
}
