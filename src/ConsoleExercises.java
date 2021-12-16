import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately, %s.", pi);

        //System.out.print("The value of pi approximately %.2f", pi);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int userInput = scanner.nextInt();

        System.out.printf("You entered: %s.", userInput);

        System.out.println("Enter 3 words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.printf("You entered: %n%s, %n%s, %n%s", userInput1, userInput2, userInput3);

//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.next();
//        System.out.printf("You entered %s", userSentence);
//
        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("You entered %s", userSentence);

        System.out.println("Enter width and length: ");
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
//        double width = scanner.nextInt();
//        double length = scanner.nextInt();
        double area = width * length;
        double perimeter = (width * 2) + (length *2);
        System.out.printf("Area: %s", area);
        System.out.printf("Perimeter: %s", perimeter);





    }
}
