package FileWriter;
import java.io.FileWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        To write on a file, you must use the FileWriter class. we can use this through this format: FileWriter -identifier- = new FileWriter("pathname");
        -> If a problem occurs during the opening of our file, we don't want this problem to affect our code, thus we must always use the try and catch method.
        -> Use the catch(IOException) to catch problems such as the file being a directory instead of a file, does not exist but can be created
            or has some problem that makes it unable to open. Under the catch method, use the -identifier name for exception-.printStackTract() to print
            the exception that occurred.
        -> NOTES: ALWAYS CLOSE THE FILE AFTER USAGE, AND USE ERROR HANDLING BECAUSE FILE CLASSES ARE DANGEROUS CODES.

        FORMATS:
        -> FileWriter file = new FileWriter(File file_name, boolean append) -> File is a file obj, if append is true, char will be written at the end.
        -> FileWriter file = new FileWriter(String pathname, Boolean append) -> Pathname is the path directory of the file

        METHODS:
        -> write(-String-) = Writes a string on the file, note that the writer will not new line automatically.
           NOTE: this method once called will always write where the writerIndicator is last left.
        -> append(-String-) = Writes a String on the very last of the file.
        -> close() = closes a writer

         */
        try{
            FileWriter writer = new FileWriter("C:\\Users\\Christian Lee Lunaba\\IdeaProjects\\Second\\FileClass\\src\\FileWriter\\Sample.txt");
            writer.write("OK\n");
            writer.append("WELL\n");
            writer.write("meh\n");
            writer.append("BOOM");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
