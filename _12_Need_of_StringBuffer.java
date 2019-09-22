package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _12_Need_of_StringBuffer {

    public static void main(String[] args) {

        // If the content have to be fixed throughout the program, then we should go for Strings, as they are IMMUTABLE
        // and for every change a new String Object will be created!!!!!

        String string = new String("Playing with");

        String newString =string.concat(" Strings!!");  // A new object will be created.

        // If the content is not fixed and keep on changing, then we should go for StringBuffer.

        StringBuffer sb = new StringBuffer("Sometime SB are ");

        sb.append("useful !");   // We can make changes to the existing objects!
        

    }
}
