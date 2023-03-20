package MyProject;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int random_number1 = min + (int) (Math.random() * max);
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        for (int i = 0; i <= 2; i++) {
            if (random_number1 == num) {
                System.out.println("Your won!");
                break;
            } else if (i != 2) {
                if (random_number1 > num) {
                    System.out.print(" More, try again, input a number: ");
                } else {
                    System.out.print(" Less, try again, input a number: ");
                }
                num = in.nextInt();
            } else {
                System.out.println("Good luck next time:)");
            }
        }
    }
}