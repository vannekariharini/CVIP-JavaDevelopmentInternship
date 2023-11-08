package TASK4;

import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int trails_left = 5;
        int upper_bound=101;
        int secret_number = random.nextInt(upper_bound);
        int guess =0;
        Scanner read= new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~Number Guessing Game~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n\nGuess the integer between 0 and 100 ");
        guess = read.nextInt();

        while(trails_left!=0) {
            if (guess > secret_number) {
                System.out.println("You guessed it wrong!\nYou have " + trails_left + " trails left\nHere's your hint:\nGuess a smaller number:");
                guess = read.nextInt();
            } else if (guess < secret_number){
                System.out.println("You guessed it wrong!\nYou have " + trails_left + " trails left\nHere's your hint:\nGuess a higher number:");
                guess = read.nextInt();
            }
            else{
                    System.out.println("CONGRATULATIONS! YOU GUESSED IT RIGHT");
            }
            trails_left-=1;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~SECRET NUMBER : "+secret_number+"~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}
