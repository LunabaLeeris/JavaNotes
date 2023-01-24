package MainNotes;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        /* LESSONS:
        - use the absolute path name for safety

        A file class is a representation of a file to create one, first create a file obj.
        FORMAT:
        -> File(import file class first) filename(name of the obj) = new File("pathname of the file we want to access");
        example: File file1 = new File("pathname.txt"); note that this will only work if the file is on the same
        directory as the class.
        METHODS :
        -> file1.exists() = returns boolean whether the associated file exists within the given pathname.
        -> fil1.getPath() = gives the pathname you inputted on the constructor of the file class
        -> file1.getAbsolutePath() = gives the true location of the file on the constructor(if it exists) within the computer.
        -> file1.isFile() = returns(boolean) whether the specified file on the constructor is actually a file
        -> file1.delete() = deletes the file specified on the constructor on the computer
           NOTE: whenever deleting a file, you may have had to refresh the folder where that file is contained
           to see whether it really is deleter or not
           RETURN: returns true if the file is deleted, false if otherwise.

        NOTE: this only works if the file exists on the same directory. If the file doesn't
        You have to specify the complete address of the file.
        You can get the full location of a file by right-clicking it on your file folders, click the properties
        at the bottom part, then copy the location, also don't forget to include the file name. Or you can go to
        the file on your intellij project folders directly, right click, then pick copypath/reference blabla
        EXAMPLE OF A VALID LOCATION:
        -> C:/Users/Christian Lee Lunaba/Desktop/Accounts.txt.
        -> same as = C:\\Users\\Christian Lee Lunaba\\Desktop\\Accounts.txt.
        */
    }
}