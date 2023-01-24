package BoundedTypes;
// this technique will allow us to limit the amount of types we can use within a generic class
// TO DO THIS: We must specify that the identifier inside  <> is a subclass of a certain class
// Thus this will limit the types that will be accepted to just the subclasses of that super class
// we can do this through inheritance

// OTHER SUPER PARENT CLASSES:
// Object class -> all pre and user defined classes

public class Main {
    public static void main(String[] args) {
        GenericClass<Number> num = new GenericClass<>(31423);
        System.out.println(num.getValue());
    }
}
// THIS WILL BOUND the class to only accept subclasses of the parent class Number
// namely:  Double, Integer, Long, Short, Float, Byte etc.
class GenericClass <T extends Number>{
    T genericAttribute;
    GenericClass(T genericParameter){
        genericAttribute  = genericParameter;
    }

    T getValue(){
        return genericAttribute;
    }
}
