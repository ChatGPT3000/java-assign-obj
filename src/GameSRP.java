import java.util.Random;
import java.util.Scanner;

public class GameSRP {
    public static void main(String[] args) {

        int answer;
        int draw = 0;
        int myScore = 0;
        int compScore = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int compPick = random.nextInt(3) + 1;
            System.out.println("Scissor (1), rock (2), paper (3) or 0 to quit: ");
            answer = scan.nextInt();
            System.out.println(compPick);

            if (answer == 0) {
                System.out.println("Score: " + myScore + " (you) " + compScore + " (computer) " + draw + " (draw).");
                break;
            }

            if (answer == compPick) {
                System.out.println("It's a draw!");
                draw++;
            } else if (answer == 1) {
                if (compPick == 2) {
                    System.out.println("You lost, computer had rock!");
                    compScore++;
                } else {
                    System.out.println("You win, computer had paper!");
                    myScore++;
                }
            } else if (answer == 2) {
                if (compPick == 1) {
                    System.out.println("You win, computer had scissor!");
                    myScore++;
                } else {
                    System.out.println("You lost, computer had paper!");
                    compScore++;
                }
            } else if (answer == 3) {
                if (compPick == 1) {
                    System.out.println("You lost, computer had scissor!");
                    compScore++;
                } else {
                    System.out.println("You win, computer had rock!");
                    myScore++;
                }
            }
        }
    }
}
