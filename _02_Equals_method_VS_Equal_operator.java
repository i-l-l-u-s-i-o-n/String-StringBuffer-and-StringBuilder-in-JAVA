package stringStringBufferStringBuilder;

/**
 * created by Shivam on 21-09-2019.
 */
public class _02_Equals_method_VS_Equal_operator {

    public static void main(String[] args) {

        ///////////////////////////////////////////////   == operator  /////////////////////////////////////////////////////

        // == is meant for REFERENCE COMPARISION.
        // If both references point to the SAME object then only it returns TRUE.


        ///////////////////////////////////////////////    equals()  /////////////////////////////////////////////////////

        // It is present in Object class. So by default available to all Java Objects.
        // It is meant for CONTENT COMPARISION.
        // BUT by default it COMPARES REFERENCES .
        // To make it compare content, we MUST override it.
        // EQUALS() is already OVERRIDDEN in STRING and all WRAPPER CLASSES for CONTENT Comparison!!!!!!!!!!!


        ////// Example ->

        String s1 =new String("Shivam");
        String s2 =new String("Shivam");

        System.out.println(s1==s2);                 // false                    As s1 and s2 are 2 different objects.
        System.out.println(s1.equals(s2));          // true                     As equals() is already overridden for Content comparision.


        StringBuffer sb1= new StringBuffer("Shivam");
        StringBuffer sb2= new StringBuffer("Shivam");

        System.out.println(sb1==sb2);               // false                     As sb1 and sb2 are 2 different objects.
        System.out.println(sb1.equals(sb2));        // false                     As equals() is not overridden for Content comparision.


        String s3 =s1;
        StringBuffer sb3 = sb1;

        System.out.println(s1==s3);                 // true                       As s1 and s3 are pointing to same object.
        System.out.println(sb1==sb3);               // true                       As sb1 and sb3 are pointing to same object.


        String s4 = new String("Shivam");
        String s5 ="Shivam";
        String s6 ="Shivam";

        System.out.println(s4==s5);                 // false                      As s4 is stored on Heap and s5 in String Constant Pool(SCP).
        System.out.println(s6==s5);                 // true                       As in SCP, duplicates are not there, so s5 and s6 both pointing to Shivam.


        // The second difference between String and SB is that in String class, equals() is overridden for CONTENT COMPARISON but in SB, equals()
        // is NOT overridden for Content Comparision, so it compares the references!


    }
}
