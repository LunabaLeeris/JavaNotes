package GenericMethod;
import java.util.Arrays;

// TAKEAWAYS: Through a generic method, we were able to create only a single method that will accommodate different reference type variables

public class Main {
    public static void main(String[] args){
        // ONLY REFERENCE DATA TYPES CAN WORK INSIDE GENERICS
        String[] str = {"a", "b", "c", "d"};
        Integer[] ints = {1, 2, 3, 4};
        Boolean[] conditions = {true, true, false, true};

        // we can print each container by calling specific methods specially designed for their data type
        getString(str);
        getIntegers(ints);
        getConditions(conditions);
        // OR we can create a GENERIC method that will accommodate all these data types
        getContainer(str);
        getContainer(ints);
        getConditions(conditions);
        // Generic return type
        System.out.println(displayIndex(str));
        System.out.println(displayIndex(ints));
        System.out.println(displayIndex(conditions));

    }
    // GENERAL METHOD:
    // TO CREATE a general method, you must write <Thing> before the return type and set the data type of your parameter same as what you wrote inside <>.
    // NOTE: You can write any valid identifier inside <> but commonly letter "T" is used.
    static <T> void getContainer(T[] container){
        System.out.println(Arrays.toString(container)); // example of a generic method
    }
    // GENERIC RETURN TYPE:
    // TO CREATE a method with a generic return type, First create a generic method and pass the identifier you
    // placed inside <> to the return data type space
    static <T> T displayIndex(T[] container){
        return container[0];
    }

    static void getString(String[] str){
        System.out.println(Arrays.toString(str));
    }
    static void getIntegers(Integer[] ints){
        System.out.println(Arrays.toString(ints));
    }
    static void getConditions(Boolean[] conditions){
        System.out.println(Arrays.toString(conditions));
    }

}