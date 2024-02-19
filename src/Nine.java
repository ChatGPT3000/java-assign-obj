import java.util.Random;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int rolltot = roll + roll2;
        int compRoll = random.nextInt(6) + 1;
        int compRoll2 = random.nextInt(6) + 1;
        int compRolltot = compRoll + compRoll2;

        System.out.println("Playing a game");
        System.out.println("=================");
        System.out.println(" ");
        System.out.println("Ready to play (Y/N)");
        String answer = scan.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("You rolled " + roll);
            System.out.println("Would you like to roll again? (Y/N) ");
            String answer2 = scan.nextLine();

            if (answer2.equalsIgnoreCase("Y")) {

                int diffPlayer = Math.abs(9 - rolltot);
                int diffComp = Math.abs(9 - compRolltot);

                System.out.println("You roll " + roll2 + " and now have " + rolltot);
                System.out.println("The computer rolled " + compRoll);
                System.out.println("The computer rolls again and gets " + compRoll2 + " in total " + compRolltot);

                if (diffPlayer > diffComp) {
                    System.out.println("You win");
                } else if (diffPlayer == diffComp) {
                    System.out.println("It's a tie");
                } else {
                    System.out.println("The computer won...");
                }
            } else {

                int diffPlayer = Math.abs(9 - roll);
                int diffComp = Math.abs(9 - compRoll);

                System.out.println("Your turn ended");
                System.out.println("The computer rolls " + compRoll);

                if (diffPlayer < diffComp) {
                    System.out.println("You win!");
                }
                if (diffPlayer == diffComp) {
                    System.out.println("It's a tie!");
                }
                if (diffComp < diffPlayer) {
                    System.out.println("You loose");
                }

            }

        }

        else {
            System.out.println("Weird but ok...");
        }
    }
}
