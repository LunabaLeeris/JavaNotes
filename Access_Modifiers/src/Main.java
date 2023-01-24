import Package2.Third;

public class Main {
    public static void main(String[] args) {
        // public, private, protected, none

        //SUMMARY:

        /* PRIVATE: anything private can only be accessed within the same class it was created inside of*/

        /* PUBLIC: anything public can be accessed on EVERY PACKAGE WITHIN THE SAME PROJECT FOLDER*/

        /* PROTECTED: anything protected within a class or a class can only be accessed by its children
        no matter the location of the package
        */

        /* None: If no access modifier is specified, this can only be accessed within the same package */

        System.out.println(Third.public_message);

        /* this means that within here, we can only access the public_message. because we're on the same project folder.
        we cannot access the text because it can only be accessed on package one.
        we cannot access the private_message because it can only be accessed inside Third class.
        we cannot access the protected message inside class Second on package 2 because we are not a subclass of it.
         */
    }
}