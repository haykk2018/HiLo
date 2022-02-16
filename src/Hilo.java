import java.util.Scanner;

public class Hilo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            int theNumber = (int) (Math.random() * 100 + 1);

            int guessNumber = 0;

            while (guessNumber != theNumber) {
                System.out.println("Guess a number between 1 and 100. \n" +
                        "then press enter");
                guessNumber = scan.nextInt();
                System.out.println("you entered " + guessNumber + ".");
                if (guessNumber < theNumber)
                    System.out.println(guessNumber + " is too low. Try again.");
                else if (guessNumber > theNumber)
                    System.out.println(guessNumber + " is too high. Try again.");
                else
                    System.out.println(guessNumber + " is correct. You win!\n");
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye.");
        scan.close();
    }
}
