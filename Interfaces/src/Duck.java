public class Duck implements waterAnimal, airAnimal{ // inheritance cannot

    public void fly(){
        System.out.println("flapped its long wings and flew straight up");
    }
    public void swim(){
        System.out.println("swam gloriously");
    }
    /* because it uses two classes as its interface we must be able to do all the functionalities of both
    interface classes
    */
}
