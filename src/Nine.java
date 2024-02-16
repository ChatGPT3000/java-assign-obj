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

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("You roll " + roll2 + " and now have " + rolltot);
                System.out.println("The computer rolled " + compRoll);
                System.out.println("The computer rolls again and gets " + compRoll2 + " in total " + compRolltot);

                if (rolltot > compRolltot) {
                    System.out.println("You win");
                }
                else if (rolltot == compRolltot) {
                    System.out.println("It's a tie");
                }
                else {
                    System.out.println("The computer won...");
                }
            }

        }
        else {
            System.out.println("Weird but ok...");
        }


    }
}
