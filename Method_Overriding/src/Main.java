public class Main {
    /* method overriding is when u declared a method on the child class that is already present on the parent class
     once the child class is called, the method on the child class will be the one that will be executed*/

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.print();
        child.print();
    }
}

class Parent{
    void print(){
        System.out.println("I'm a parent");
    }
}

class Child extends Parent{
    @Override // it is convention to write this on top of A override method
    void print(){
        System.out.println("I'm a child");
    }
}
// NOTE: you cannot override a static method!! - static method should be unique
// example:
/* class Child2 extends Parent{
    static void print(){
        System.out.println("im another child");
    }
}*/