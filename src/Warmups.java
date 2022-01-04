import java.util.Scanner;

public class Warmups {

//      1-04-22
    public static String startDay() {
        return "Brain loading... Done!";
    }

    public static void main(String[] args) {
//        12-15-21
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");

//        12-16-21
        Scanner scanner = new Scanner(System.in);
        System.out.println("What did you eat for breakfast today?");
        String userBreakfast = scanner.nextLine();

        System.out.printf("%s. But why?", userBreakfast);

//        1-04-22

            System.out.println(startDay());







    }
};