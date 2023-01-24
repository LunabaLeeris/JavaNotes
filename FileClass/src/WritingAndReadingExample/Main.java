package WritingAndReadingExample;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* GOAL: to read a password file, store its value inside a database file, then delete that
   password file */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the location of the password File");
        String pathname;
        StringBuilder password = new StringBuilder();
        /*  NOTE: StringBuilder is a class container, which means we can only use its value through methods within this class namely
            String.valueOf(-StringBuilder Object-). */
        pathname = input.nextLine();
        File pass = new File(pathname);

        if (pass.exists()){
            if (pass.isFile()){
                try{
                    FileReader reader = new FileReader(pass); /* note that fileReader and writer classes can also accept
                     file objects */
                    int data = reader.read();
                    while (data != -1){
                        password.append((char)data);
                        data = reader.read();
                    }
                    //password.append("\n");
                    reader.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }

                try{
                    FileWriter writer = new FileWriter("C:\\Users\\Christian Lee Lunaba\\IdeaProjects\\Second\\FileClass\\DataBase", true);
                    /* by specifying that append is true, our writer will always write at the end of our file (append)*/

                    writer.write("Password: ");
                    writer.write(String.valueOf(password));
                    writer.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }

                System.out.println("Transfer Successful");
            }
            else{
                System.out.println("That is not a file!");
            }
            if (pass.delete()){
                System.out.println("Deletion Successful");
            }
            else{
                System.out.println("File password Cannot be deleted");
            }
        }
        else{
            System.out.println("File does not exist!");
        }
    }
}
