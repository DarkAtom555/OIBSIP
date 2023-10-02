
import java.util.*;

    public class NumberGuess {
        public static void main(String[] args) {
         numberr();

        }

        public static void numberr() {
            Random rand = new Random();
            int randnu = rand.nextInt(11);
            guess(randnu);
        }

        public static void guess(int randn) {
            System.out.printf("******* NUMBER GUESSING GAME *******\n");
            System.out.printf("Guess the number between 0-10: ");
            Scanner in = new Scanner(System.in);
            int ans = in.nextInt();
            System.out.printf("\n");
            while (ans < 0 || ans > 10) {
                System.out.printf("Please enter a valid number between 0 to 10\n");

                System.out.printf("Guess the number between 0-10: ");

                ans = in.nextInt();
                System.out.printf("\n");
            }
            int tries = 0;
            while (ans != randn) {
                  tries++;

                   System.out.printf("try again\n");

                 System.out.printf("****** NUMBER GUESSING GAME ******* \n");
                 System.out.printf("Guess the number between 0-10: ");

                  ans = in.nextInt();
                 System.out.printf("\n");
                 while (ans < 0 || ans > 10) {
                      System.out.printf("!!!!!!!!please enter a number between 0 to 10\n");

                      System.out.printf("!!!Guess the number between 0-10: ");

                      ans = in.nextInt();
                      System.out.printf("\n");
                }

            }
            System.out.printf("Correct!! You Won with "+tries+ " Wrong tries...\n");
            System.out.println("*****press 1 to play again and 0 to exit*****");
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    numberr();
                    break;
                case 0:
                    return;

                default:
                    System.out.println("Invalid");
            }
        }
    }



