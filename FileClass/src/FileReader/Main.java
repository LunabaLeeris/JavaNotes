package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try { // just like a file writer, we need to use try and catch because this program is dangerous
            FileReader reader = new FileReader("C:\\Users\\Christian Lee Lunaba\\IdeaProjects\\Second\\FileClass\\src\\FileReader\\Sample1.txt");
            int data = reader.read();
            /* The read() method will read each character within a text file and return a byte representation of that number(integer)*/
            while (data != -1){ /* we must loop and call the read method to read the file, until an endpoint is reached
            in our case, we  will only stop if there are no more characters to be read */
                System.out.print((char)data); /*to convert this byte value back to char, we must typecast the byte value to char. FORMAT: (char)-byteValue- */
                /* NOTE: use print not println because print ln will add \n to the end of each printed value */
                data = reader.read();
            }
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
