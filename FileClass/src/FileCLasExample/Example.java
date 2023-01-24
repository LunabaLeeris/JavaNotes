package FileCLasExample;

import java.io.File;
import java.util.Scanner;

/* GOAL: to see whether a password file exists, read its content, get its file path name
and delete it within that path name.*/

public class Example {
    public static void main(String[] args) {
        String pathnameFile;
        Scanner input = new Scanner(System.in);

        File pass = new File("C:\\Users\\Christian Lee Lunaba\\IdeaProjects\\Second\\FileClass\\Password.txt");

        if (pass.exists()){
            if (pass.isFile()) {
                pathnameFile = pass.getAbsolutePath();
                System.out.println("reads the content and stores it");
                if (pass.delete()) {
                    System.out.println("file successfully deleted, refresh your folder to see");
                } else {
                    System.out.println("failed to delete file");
                }
            }
            else {
                System.out.println(""+pass.getPath()+" is not a file ");
            }
        }
        else {
            System.out.println("File does not exist!");
        }
    }
}
