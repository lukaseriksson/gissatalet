import java.util.Scanner;

public class spel {

     public static void main(String[] args) {

           int secretNumber;

           secretNumber = (int) (Math.random() * 99 + 1);          

           Scanner keyboard = new Scanner(System.in);

           int score=0;
           int guess;

           do {

                 System.out.print("Skriv ett nummer mellan (1-100): ");

                 guess = keyboard.nextInt();

                 score++;
                 if (guess == secretNumber)

                       System.out.println("Du lyckades, bra jobbat! ditt poäng är " + score);

                 else if (guess < secretNumber)

                      

                 System.out.println("Din gissning ar mindre an det hemliga nummret.");

                 else if (guess > secretNumber)

                       

                       System.out.println("Din gissning ar större an det hemliga nummret.");

           } while (guess != secretNumber);

     }

}

