package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
public class _16_StringBuilder_class {

    public static void main(String[] args) {

        // The StringBuilder class was introduced in 1.5v

        // As StringBuffer class is Thread Safe, so performance is low,
        // so to overcome this, StringBuilder class was introduced.

        // StringBuilder is same as StringBuffer except all the methods are NOT SYNCHRONISED in StringBuilder.
        // So stringBuilder is NOT THREAD SAFE.

        // The Constructors are same as StringBuffer.

        // The methods are also same as StringBuffer.

        StringBuilder sb = new StringBuilder("Shivam");

        sb.append(" Shukla");

        sb.setCharAt(6,'_');

        System.out.println(sb);             // Shivam_Shukla

        sb.reverse();

        System.out.println(sb);             // alkuhS_mavihS

        sb.reverse();

        sb.insert(0,'_');
        sb.insert(sb.length(),'_');

        System.out.println(sb);             // _Shivam_Shukla_
    }
}
