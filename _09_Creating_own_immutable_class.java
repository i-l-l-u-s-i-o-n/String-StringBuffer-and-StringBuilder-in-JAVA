package stringStringBufferStringBuilder;

/**
 * created by Shivam on 22-09-2019.
 */


// We can create our own Immutable class ->


// First we have to declare the class as FINAL so that no class can Extend our class and Override the methods!!!!!
final class Test {

    // Make all fields PRIVATE.
    private int i;

    // Set the values using constructors
    public Test(int i){
        this.i=i;
    }

    // In immutable classes (String), if the content is same , it returns the same object.
    // If the content is not same , it returns the new Object.
    // So we have to implement such type of logic.

    public Test modify(int i){

        // If the value of i is same as value if current object's i
        if (i==this.i){
            return this;    // Return the current object.(the content is same, so return same object. No need to create new Object).
        }

        else {
            // If content is not same then only create a new object with new content.
            return  new Test(i);
        }
    }


    public static void main(String[] args) {


        Test t1 =new Test(10);      // Suppose a String object is created with content 10;

        Test t2 =t1.modify(100);      // Now we are requesting for a object whose content is 100, as there is no object
                                      // so a new object with content 100 will be created!

        Test t3 =t1.modify(10);       // Since the content is same, so no need to create new object, The same object will be used
                                      // and another reference will be assigned.

        System.out.println(t1==t2);   // false
        System.out.println(t1==t3);   // true

        // Test is a immutable class because once we created test object, we can't perform any changes.
        // If we try to do so, a new object will be created.


    }
}

