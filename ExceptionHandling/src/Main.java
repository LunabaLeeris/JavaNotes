import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        exception handling in  java, works just like exception handling in Python. But
        instead of using except, here we will use catch to catch an exception. Finally still
        works as usual.

        TO create a catch function, do catch(exception -whitespace- identifier){what to do}
        NOTE: you can catch all exceptions just by using the Exception key word, But it is
        convention to specify what exception you are catching.
         */

        /* EXAMPLE OF EXCEPTIONS:
        ArithmeticException = improper maths such as dividing by zero.
        InputMismatch = Mismatched input data type
         */
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Input an integer");
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException a){
            System.out.println("Division by zero error");
        }
        catch(InputMismatchException b){
            System.out.println("Input an integer");
        }
        finally {
            System.out.println("Program finished"); // this will be executed no matter what
            input.close();
            /*
            Finally blocks are useful for closing stuffs that are opened such as
            files, scanners. This might come in handy whenever you're opening a database
            to ensure that it will always be closed after using it.
             */
        }
    }
}