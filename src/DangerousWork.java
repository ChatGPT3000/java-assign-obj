import java.util.Scanner;

public class DangerousWork {
    public static void main(String[] args) {

        int days = 0;
        double ore = 0.001;
        Scanner scan = new Scanner(System.in);

        System.out.println("How much would you like to earn? ");
        double income = scan.nextInt();

        while (ore < income) {
            ore = ore*2;
            days++;
        }

        System.out.println(ore);
        System.out.println(days);

        if (days > 30) {
            System.out.println("But you died though...");
        }
    }
}
