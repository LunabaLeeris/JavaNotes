public class Main {
    public static void main(String[] args) {
        /* Encapsulation will allow us to hide our datas so that it can't be mis used outside our class
        example: if I have a variable named password, outsiders can change it very easily.
        to achieve this we can make private our attributes */

        /* It is ideal to always encapsulate our units by default if you have no good reason not to */

        /* But beside this, we can still access the private attributes using getter methods to obtain the value
        of our units and the setter methods to change the value of our units
        */

        /* you're maybe asking if it can still be set to another value, then what makes it different to not privation it?.
        well through using a setter method, we can add layers of logic that will be processed before our private values
        can be changed example: through encapsulating our attribute password, we can create a setter method that will allow
        a user to change the attribute password IF AND ONLY IF he passed the previous password first
        */

        /* without encapsulation, outside users can directly change our attribute password. */

        createAcc acc1 = new createAcc("9ai3qngu67"); // creates our acc with a given password

        acc1.get_password("12312"); // because our password inputted is wrong, it will not display our password
        acc1.set_password("9ai3qngu67", "Ziloveyo67"); // because we satisfied the condition of this method
        // we will be able to change our password

        acc1.get_balance("i dont know"); // because the password is incorrect, we will never be able to get the balance of our acc
        acc1.get_password("Ziloveyo67");
        acc1.set_balance("Ziloveyo67", 123235125); // because the condition is satisfied, we will be able to change the balance

        /* CONCLUSION: encapsulation will allow us to hide our important attributes where it can be only accessed through setter and getter
        methods. This is useful as it allows us to provide logic and condition that will only allow a user to access our data IF AND ONLY IF the
        conditions are met. the user will not know the internal logic of our system and change its data's as he desires.

        ALSO, it provides a clearer view on what will happen and allows our code to be reusable like packaged, allows it to be testable and
        allows our over all code to be maintainable

        USE encapsulation as default!
        */

    }
}

