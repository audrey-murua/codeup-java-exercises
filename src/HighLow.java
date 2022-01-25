import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Let's play a game! It's called High or Low.");
            int randomNumber = (int) Math.floor(Math.random() * 100);
            int userNumber;

            do {
                System.out.println("Choose a number between 1 - 100");
                userNumber = scanner.nextInt();

                if (userNumber < randomNumber){
                    System.out.println("HIGHER!");
                } else if (userNumber > randomNumber){
                    System.out.println("LOWER...");
                } else if (userNumber == randomNumber){
                    System.out.println("GOOD GUESS!");
                }
            }   while (userNumber != randomNumber);


    }


}
