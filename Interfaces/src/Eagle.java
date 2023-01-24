public class Eagle implements airAnimal {

    @Override
    public void fly(){ /* because it uses airAnimal as an interface(template), then we must have
        the ability to fly() too */
        System.out.println("Flew at high speed towards prey");
    }
}
