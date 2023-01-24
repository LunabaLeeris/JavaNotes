public class Whale implements waterAnimal{
    @Override
    public void swim(){ /* because it uses water Animal as interface(template), we must be able
    to do all the functionalities of that interface class */
        System.out.println("Swam up, showing its beauty");
    }
}
