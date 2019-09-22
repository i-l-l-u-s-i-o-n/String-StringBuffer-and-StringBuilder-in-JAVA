package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _18_Method_Chaining {

    public static void main(String[] args) {

        // In String, StringBuilder, and StringBuffer class, most of the methods have RETURN TYPE SAME AS THE CLASS itself.

        // Example -> for string s - s.concat() returns String Object, similarly trim(), replace() etc also return String.
        //            for StringBuffer sb, sb.append() returns SB object, similarly insert(), delete() etc return SB object.

        // So we can call 1 method and then on it's result we can call another method.
        // Example ->

        StringBuffer sb = new StringBuffer("Shivam");

        // ----------------------------------------------------------------------------------------------------//
        sb.append(" ").append("Shukla").reverse().insert(0,'_').insert(sb.length(),'_').reverse();
        // ----------------------------------------------------------------------------------------------------//

        // This is called Method Chaining.
        // The methods are evaluated from LEFT to RIGHT.

        System.out.println(sb);             // _Shivam Shukla_

    }
}
