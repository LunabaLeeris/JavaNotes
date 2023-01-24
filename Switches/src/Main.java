import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // rock paper scissors using switches
        // KEY POINTS: whenever entering a new function in a switch, encapsulate the function inside curly braces
        // also you can add multiple arguments on one case to say ||, example: case 1,2 = if = 1 or = 2
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("rock, paper, scissors?");
        String choice = scanner.nextLine();
        int robot_choice = random.nextInt(3);

        String message = null;

        switch (robot_choice){
            case 0 -> {
                System.out.println("computer chose rock");
                switch (choice) {
                    case "rock" -> message = "draw";
                    case "paper" -> message = "you won";
                    case "scissor" -> message = "you lost";
                }
            }
            case 1 -> {
                System.out.println("computer chose paper");
                switch (choice){
                    case "rock" -> message = "you lost";
                    case "paper" -> message = "draw";
                    case "scissor" -> message = "you won";
                }
            }
            case 2 -> {
                System.out.println("computer chose scissor");
                switch (choice){
                    case "rock" -> message = "you won";
                    case "paper" -> message = "you lost";
                    case "scissor" -> message = "draw";
                }
            }
        }
        System.out.println(message);
    }
}