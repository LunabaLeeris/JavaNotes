package GenericClasses;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        IntClass integer = new IntClass(3);
        StringClass str = new StringClass("ok");
        CharClass chr = new CharClass('*');

        //Instead of instantiating multiple classes that can hold their specific data types like the above and below
        System.out.println(integer.getValue());
        System.out.println(str.getValue());
        System.out.println(chr.getValue());
        // we can  instead create a generic class that can accommodate different data types
        System.out.println("---------------------"); // ignore this
        // TO INSTANTIATE A GENERIC CLASS:
        // 1st: Type the name of the class, followed by a <> where inside lies the data type you will enter on the constructor
        // NOTE: YOU CAN ONLY USE REFERENCE DATA TYPES!
        // 2nd: type the new followed by the name of the generic class and another <>
        // 3rd: Finally, input the parameter you will pass on the constructor;
        GenericClass<Integer> ints = new GenericClass<>(3); // example of instantiating a generic class properly
        GenericClass<Character> chars = new GenericClass<>('&');
        GenericClass<String> strs = new GenericClass<>("MEHEHEHE");
        System.out.println(ints.getValue());
        System.out.println(chars.getValue());  // call the method getValue then print it
        System.out.println(strs.getValue());

        // NOTICE THAT: this is also how we instantiate an ArrayList!
        ArrayList<Integer> intArr = new ArrayList<>(); // here!
        // This is because an array list is a generic class, and it should be a generic class to allow a user to create
        // different Types of ArrayLists e.g. Integers, Strings, Objects, Characters etc.
        // If an ArrayList is not a generic class, just imagine the hassle of memorizing specific array builders for each data types!.

        // ALSO: Sometimes you need to pass multiple parameters on a class's constructor. If you intend to make all the parameters generic
        // THen you should also specify them inside the <>. EXAMPLE:
        SecondGenericClass<Character, Integer> result = new SecondGenericClass<>('$', 300); // Here I specified that I used Character and an Integer
        System.out.println(result.getValues());

        // NOTICE THAT: this is also how we create a HashMap!
        HashMap<Integer, Character> map = new HashMap<>(); // here!

        // Now that's why you can only pass  reference data types inside the <> of a HashMap and an ArrayLists
        // IT'S BECAUSE THEY ARE GENERIC CLASSES!
     }
}
