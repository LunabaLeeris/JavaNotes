package GenericClasses;
// TO CREATE A GENERIC CLASS:
// 1st place the <> after the class name
// 2nd add an identifier between the <>. Typically, the charter 'T' is used, but anything can work.

public class GenericClass <Thing>{
    // whenever creating a generic attribute, use the identifier our placed inside <>
    Thing element; // example of a generic attribute
    Thing name; // You can use the Thing multiple times!
    // The only problem  is  that, anything with a Thing as a generic data type will become
    // The same data type one Thing is specified.

    // 3rd: TO create a generic constructor, create it like how you create a generic method.
    GenericClass(Thing element){
        this.element = element;
    }

    // 4th: this is just like a generic method. You may ask why i no longer included the <> before the return type
    // This is because we already have our generic identifier instantiated at our class name.
    public Thing getValue(){
        return this.element;
    }
}
