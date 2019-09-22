package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */
class MaskCard{



    // Our requirement is to hide the number of credit card except last 4 digits and the Hyphens (-).
    // Example -> if card number is 1234-5678-9101-1213 , the after masking =>> xxxx-xxxx-xxxx-1213.


    // We are given 4 options ->

    // Option 1

    public static String mask1(String creditCard){

        String x = "xxxx-xxxx-xxxx-";


        StringBuilder sb = new StringBuilder(creditCard);

        // In this option, following line will be of no use as we are not storing the result.
        sb.substring(15,19);

        // We are concatenating x and whole creditCard.
        return x+sb;

    }

    // Option 2
    public static String mask2(String creditCard){

        String x ="xxxx-xxxx-xxxx-";

        StringBuilder sb = new StringBuilder(creditCard);

        // We are inserting x at index 0, but after it whole number will be there.
        sb.insert(0,x);

        return x+sb;
    }

    // Option 3
    public static String mask3(String creditCard){

        String x ="xxxx-xxxx-xxxx-";

        return x + creditCard.substring(15,19);
    }

    // Option 4
    public static String mask4(String creditCard){

        String x ="xxxx-xxxx-xxxx-";

        StringBuilder sb = new StringBuilder(x);

        // Here we are appending the last 4 digits of creditCard number to x.
        sb.append(creditCard,15,19);

        return sb.toString();
    }

    public static void main(String[] args) {

        String creditCard = "1234-5678-9101-1121";

        System.out.println(mask1(creditCard));      // xxxx-xxxx-xxxx-1234-5678-9101-1121
        System.out.println(mask2(creditCard));      // xxxx-xxxx-xxxx-xxxx-xxxx-xxxx-1234-5678-9101-1121
        System.out.println(mask3(creditCard));      // xxxx-xxxx-xxxx-1121
        System.out.println(mask4(creditCard));      // xxxx-xxxx-xxxx-1121

        // So option 3 and 4 fulfills our need!

    }
}
