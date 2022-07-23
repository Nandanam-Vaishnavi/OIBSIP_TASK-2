import java.util.Scanner;

public class Game{
public static int pointsInitiator(int n) {
        int points = 0;
            if(n==0)
                points = 50;
            else if(n==1)
                points = 10;
               
            else if(n==2)
                points = 7;
                
            else if(n==3)
                points = 5;
                
            else if(n==4)
                points = 2;
           else{
             points=0;
           
         
        }
        return points;
    }
	
	 public static void Games() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int trials = 5;
        int i, guess;
        System.out.println("               **NUMBER GUESSING GAME**                 ");
        System.out.println("Choose a number between 1 to 100:");
        System.out.println("Game Instructions:");
        System.out.println("You will be awarded the Points.\n" +
                "For attempt1 you will be awarded with : Points 50\n" +
                " attempt2 : Points 10\n attempt3 : Points 7\n attempt4 : Points 5\n attempt5 : Points 2");
        for (i = 0; i < trials; i++) {
            System.out.println("Guess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!Your Points:" + pointsInitiator(i));

                break;
            } else if (number > guess && i != trials - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != trials - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == trials) {
            System.out.println("You have exhausted 5 trials.\nYour Score:0");
            System.out.println("The number was " + number);
            System.out.println("Better Luck next time!:)");
        }
    }

    public static void main(String arg[]) {
        Games();
    }
}
