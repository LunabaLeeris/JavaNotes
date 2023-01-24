package Package1;
import Package2.*;

public class Second {
    protected static String protected_message = "Protected";
    /* System.out.print(Third.private_message); this class will not be able to access this private message
        because private will only be accessed within the class it was created inside. */
}
