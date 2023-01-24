public class Main {
    public static void main(String[] args) {
        /* INTERFACES: works like abstraction. Basically an interface serves as a template that will
        ensure that every subclass that inherits from it contains a set of attribute and methods*/

        /* the only difference and edge it has over abstraction is that using interfaces a class
        can have multiple interfaces as its templates. This means that a class can follow two set of templates
        */

        /*in interfaces, we use "implements" instead of "extends" */

        /* in layman's term, an interface is a template. a class that uses an interface can have multiple templates
        whereas a class that uses inheritance can only have one.
        */

        Whale whale = new Whale();
        Eagle eagle = new Eagle();
        Duck duck = new Duck();

        waterAnimal dolphin = new waterAnimal() {
            @Override
            public void swim() {
                System.out.println("swam quickly");
            }
        }; /* in abstraction, classes that are abstracted can not be instantiated. in interfaces,
        you can instantiate an interface class but the value that will be produced will automatically become
        an object that comes from a class that uses waterAnimal as interface/template*/
        // another example:

        airAnimal hawk = new airAnimal() {
            @Override
            public void fly(){
                System.out.println("Flew High"); // this is an easier way to create a class with a given interface
            } // only disadvantage is that you cannot use two interfaces at once. atleast none that i know of
        };


        whale.swim();
        eagle.fly();
        // then there comes the duck which can both fly and swim
        duck.fly();
        duck.swim();
        dolphin.swim();
        hawk.fly();

        /* interface classes still works like inheritance therefore
        we can also access the attributes of our interface class (if it's not made private) */
        System.out.println(whale.type);



        /* SUMMARY: INTERFACE ARE JUST SPECIAL CASES OF ABSTRACTION! as it allows a class to have
        multiple templates. every method in an interface class is abstracted! while the class remains not!
        */

        /* NOTES:
        -attributes instantiated in an interface class are not automatically abstracted
        -abstract modifiers are not allowed inside an interface class
        -interfaces works like inheritance
        -interfaces can have multiple supers/parents
        -CONSTRUCTORS ARE NOT ALLOWED IN INTERFACE CLASSES
        -You can instantiate an interface class. therefore this class is not abstract, despite having abstract methods
         */
     }
}





