package Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0;
        int computerWins = 0;
        int drawGames = 0;

        System.out.println("Rock Paper Scissors Game");
        System.out.println("Created by Anton Ganev.");
        System.out.println("--------------------------------------");
        System.out.println("If you want to quit the game type end.");
        System.out.println("--------------------------------------");
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playersMove = scanner.nextLine();

        while (!playersMove.equals("end")) {

            if (playersMove.equals("r") || playersMove.equals("R") || playersMove.equals("rock") || playersMove.equals("Rock")) {
                playersMove = "Rock";
            } else if (playersMove.equals("p") || playersMove.equals("P") || playersMove.equals("paper") || playersMove.equals("Paper")) {
                playersMove = "Paper";
            } else if (playersMove.equals("s") || playersMove.equals("S") || playersMove.equals("scissors") || playersMove.equals("Scissors")) {
                playersMove = "Scissors";
            } else {
                System.out.println("Invalid input! Try again...");
                System.out.print("Choose wisely: ");
                playersMove = scanner.nextLine();
                continue;
            }

            System.out.printf("Player choose: %s%n", playersMove);

            String computerMove = "";
            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);

            switch (computerRandomNumber) {
                case 0:
                    computerMove = "Scissors";
                    break;
                case 1:
                    computerMove = "Paper";
                    break;
                case 2:
                    computerMove = "Rock";
                    break;
            }

            System.out.printf("Computer choose: %s%n", computerMove);

            if (((playersMove.equals("Rock") && computerMove.equals("Scissors"))) || (playersMove.equals("Paper") && computerMove.equals("Rock")) ||
                    playersMove.equals("Scissors") && computerMove.equals("Paper")) {
                System.out.println("You win!");
                playerWins++;

            } else if ((playersMove.equals("Rock") && computerMove.equals("Paper") || (playersMove.equals("Paper") && computerMove.equals("Scissors")) ||
                    (playersMove.equals("Scissors") && computerMove.equals("Rock")))) {
                System.out.println("Computer wins!");
                computerWins++;

            } else {
                drawGames++;
                System.out.println("This game was a draw.");
            }
            System.out.print("Choose again:");
            playersMove = scanner.nextLine();
        }

        System.out.println("Statistics of the game:");
        System.out.printf("Player Win/s: %d%n", playerWins);
        System.out.printf("Computer Win/s: %d%n", computerWins);
        System.out.printf("Drawn Game/s: %d%n", drawGames);
    }
}
