package Serialization;

import java.io.*;
public class Main {
    // Serialization allow you to save the content/state of an object on another file as byte code
    // This can then be sent to other machines where it can be deserialized.
    // THIS IS USEFUL SPECIALLY FOR WIRELESS MULTIPLAYER GAMES OR DATA SHARING

    /* TO SERIALIZE FOLLOW THE STEPS
       1. Make sure your object implements from the Serializable class
       2. Import the package
       3. Create a file stream through FileOutputStream myFile = new FileOutputStream("file path")
         File path pertains to the file location where we want to save our byte code
       4. Create an Object stream through ObjectOutputStream myObj = new ObjectOutputSteam(FileOutputStream file);
         This receives a FileOutputStream instance.
       5. use the Object Stream instance and use the method writeObject(Object obj) to write the serialized version of the obj inside
         The file at the location specified on step 3.
       6. close the ObjectOutputStream obj.
       7. don't forget to account for exceptions (IOException) such as file not being found, File not being a proper file, file can't be opened etc.
       8. CLOSE FILES
     */

    public static void main(String[] args) throws IOException {
        // Change the class
        GameData player1 = new GameData();
        player1.level = 99;
        player1.name = "Lord";
        player1.power = 9999;
        player1.speed = -999;
        // save the class obj state inside a file through serialization
        // step 3
        FileOutputStream myFile = new FileOutputStream("GameState.ser");
        // step 4
        ObjectOutputStream myObj = new ObjectOutputStream(myFile);
        // step 5
        myObj.writeObject(player1);
        // steps 8
        myFile.close();
        myObj.close();
    }
}