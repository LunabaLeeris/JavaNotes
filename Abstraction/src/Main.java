public class Main {
    public static void main(String[] args) {
        /* abstraction will allow you to disable a class from being instantiated while still allowing
        its child classes to be called. This is useful as it adds security to your program

        EXAMPLE1: we have an abstract class named recipe for cokes and subclasses which are different types
        of cokes like sweet, sugar-free, carbs free etc. all of these subclasses inherits from the parent class,
        and they follow a certain format specified on the parent class.
        all we want is for the user to know what the subclasses look's like, example the ingredients of a sweet coke,
        but we don't want the user to know the contents of the parent class so that he can't create a new version of his coke */

        /* IN SHORT: abstraction will allow you to create an abstract idea that will be a blueprint for all the subclasses*/

        /* YOU CAN ALSO MAKE A METHOD ABSTRACT. when abstracting a method on a parent class the method should not have a body
        because all this abstraction does is force a user to implement this method whenever creating a child of that parent class.

        EXAMPLE2: we have our parent abstract class named disney_princesses, now we can create an abstract method on that class named
        abstract void sing(), abstract void dance() and abstract fight().

        once we decide to create a subclass of our abstracted parent class named rapunzel() it will force us to make the class able to
        do all the abstracted methods(functionalities) of the parent class which are dance(), sing() and fight()        */

        /* in a nutshell, abstraction helps us create a parent class where all its subclasses contains certain functionalities
        in our case, by abstracting the methods sing(), dance() and fight(), it will ensure that all the disney_princesses() subclass we will create
        can dance(), sing() and fight()
        */

        /* NOTES: you can only create abstract methods inside abstract classes */

        Rapunzel rapunzel = new Rapunzel();
        Cinderella cinderella = new Cinderella();

        rapunzel.sing();
        cinderella.sing();
        rapunzel.kiss();

        // CONCLUSION: use abstraction so that all the subclasses of a parent will follow a certain format
    }
}

abstract class Disney_Princesses{ // by doing this, we can make it so that a user will not know what makes a Disney_princess
    abstract void dance();
    abstract void sing();
    abstract void fight();

    void kiss(){ // Through abstraction, every disney princess will have the method of kissing, but users will not know the contents of this method just the stuff it does.
        System.out.println("kisses the living shit our of you");
    }
}
// due to abstraction we are forced to make Rapunzel able to dance() sing() and fight()
class Rapunzel extends Disney_Princesses{
    @Override // not necessary just convention
    void dance(){
        System.out.println("dances hiphop");
    }
    @Override
    void sing(){
        System.out.println("sang like an angel");
    }
    @Override
    void fight(){
        System.out.println("killed a bird");
    }
}

class Cinderella extends Disney_Princesses {
    @Override
        // not necessary just convention
    void dance() {
        System.out.println("dances ballet");
    }

    @Override
    void sing() {
        System.out.println("sang and all the birds chirped");
    }

    @Override
    void fight() {
        System.out.println("Fought bravely");
    }
}