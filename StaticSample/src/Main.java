public class Main{
    public static void main(String[] args) {
        static_sample sample1 = new static_sample(3);
        static_sample sample2 = new static_sample(4);
        /* note static attributes should be unique

         on sample1, I created an object of class static_samples, within its constructor, i incremented the static
         attribute named range by 1. the same is done for sample2
         this means that in total the value of range should be 2 */

        System.out.println(static_sample.range);
        /*because range is static, we no longer need to create an object to access it, but it can still be accessed using an object
        this is like a class attribute in python.
        also you can use the static key word for methods to make it easier for access.*/

        static_sample.print_range(); // this is how most methods work in java example: Maths.round()

        // in conclusion a static key word will allow an attribute to be global and shared among all objects of that class
    }
}