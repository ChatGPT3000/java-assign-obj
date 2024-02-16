import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number of seconds: ");
        int seconds = scan.nextInt();
        int secondsLeft = seconds % 60;
        int minutes = seconds / 60;
        int minutesLeft = minutes % 60;
        int hours = minutes / 60;
        System.out.println(
                "This corresponds to: " +
                        hours + " hours, " +
                        minutesLeft + " minutes, " +
                        secondsLeft + " Seconds");
    }
}
