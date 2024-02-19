import java.util.Arrays;
import java.util.Scanner;

public class Diamonds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give a positive number ");
        
        String line = "";

        int antal = scan.nextInt();
        int k = antal - 1;
        int count = 0;
        int b = 1;

        for (int a = 0; a < antal * 2; a++) {
            for (int j = 0; j < k; j++) {
                line = line + " ";
            }
            for (int i = 0; i < b; i++) {
                line = line + "*";
            }

            System.out.println(line);
            count++;

            if (count < antal) {
                k--;
                b = b + 2;
                line = "";
            } else {
                k++;
                b = b - 2;
                line = "";
            }
        }
    }
}
