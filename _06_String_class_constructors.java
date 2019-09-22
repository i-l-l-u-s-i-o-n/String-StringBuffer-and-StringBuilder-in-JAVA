package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _06_String_class_constructors {

    public static void main(String[] args) {

        // Create as empty string object!
        String s = new String();


        // Takes String Literal as argument!
        String s1 =new String("Shivam");


        // Takes StringBuffer object as argument, if we want to convert SB to String.
        String s2 = new String(new StringBuffer("Shivam"));

        // Takes StringBuilder object as argument, if we want to convert StringBuilder to String.
        String s3 = new String(new StringBuilder("Shivam"));


        // Takes char array as argument to represent group of array elements as a string.
        String s4 = new String(new char[]{'s','h','i','v','a','m'});


        System.out.println(s4);             // shivam
        System.out.println(s);              //


        // Takes byte[] as argument.
        String s5 = new String(new byte[]{97,98,99,100,101});

        System.out.println(s5);             // abcde
    }
}
