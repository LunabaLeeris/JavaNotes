package Package2;
import Package1.*;

public class subSecond extends Second{
    public static void main(String[] args) {
        System.out.println(Third.text); // here we can access text because this class is on the same package
        System.out.println(Third.public_message);
        System.out.println(Second.protected_message); // this class can access this protected message because it is a
        // subclass of the class that owns it
    }
}
