public class Main {
    public static void main(String[] args) {
        /* inheritance is when a class inherits all the attributes and methods of another class
         the inheritor can be classified as a child while the inherited class is the parent*/

        /* KEY POINTS : when you create a parent class and instanced its attributes, the child class will not
         necessarily copy it right away
         when you create a child class with a parent that has a constructor, you can use all the parameters
         inputted on the child class and then pass it on the parent class through super()
         this will allow yoy to access the contractor of the parent class and create all the attributes
         IN SHORT : a child class does not create a copy of the methods, constructors and attributes of its parent class
         inheritance just allows you to have access to those and use them on the child class 0

         when you create a child class object, a new parent class is also created */

        Parent parent = new Parent("brown", "A+", "Asian", "white");
        // here I created a parent object of parent class
        parent.printAttributes();
        Child child = new Child("black", "A+", "Asian", "white");
        // notice here that even though Child inherits from Parent, child obj still differs from parent obj
        child.printAttributes();
        // inherits from the same parent class as child but has additional attributes
        Child1 child1 = new Child1("green", "o", "american", "black", 18);
        child1.printAttributes(); // overrides the printAttributes function of parent class

    }
}
class Parent {
    String eye_color;
    String blood_type;
    String race;
    String skin_color;

    Parent(String eye_color, String blood_type, String race, String skin_color){
        this.eye_color = eye_color;
        this.blood_type = blood_type;
        this.race = race;
        this.skin_color = skin_color;
    }

    void printAttributes(){
        System.out.println("eye color: "+this.eye_color+"\nblood type: "+this.blood_type+"\nrace:"+this.race+"\nskin color: "+this.skin_color+"");
    }
}

class Child extends Parent {
    Child(String eye_color, String blood_type, String race, String skin_color) {
        super(eye_color, blood_type, race, skin_color); // super is the parent class, this just means that
        // once you create a child object and passed the parameters, the parameters will then be passed on the super
        // class and will automatically create all the attributes on the parent class
    }
}

// another example of using super
class Child1 extends Parent {
    int age;
    Child1(String eye_color, String blood_type, String race, String skin_color, int age) {
        super(eye_color, blood_type, race, skin_color);
        this.age = age;

    }

    @Override // method overriding because we also want to print the age
    void printAttributes() {
        System.out.println("eye color: " + this.eye_color + "\nblood type: " + this.blood_type + "\nrace:" + this.race + "\nskin color: " + this.skin_color + "\nage:" + this.age + "");
    }
}