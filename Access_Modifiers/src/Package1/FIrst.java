package Package1;
import Package2.*;

public class FIrst {
    public static void main(String[] args){
        /* System.out.println(Third.text); // text is not visible to class FIrst because text is a default access modifier
        and an identifier without a modifier can only be accessed on the same package*/

        System.out.println(Third.public_message); // now this is accessible because public will allow an attribute to be
        // access across all packages within the same project folder

        /* System.out.println(Second.protected_message); // This class will not be able to access the attribute of class Second
        even though it is on the same package because this attribute is protected. protected access modifier can only be
        accessed if the class is a subclass of it */
    }
}
