package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter choice here: ");
        String userResponse = scanner.nextLine();
        System.out.printf("You entered: %s \n", userResponse);
        return userResponse;
    }

    public boolean yesNo() {
        System.out.println("Type yes or no: ");
        String userResponse = scanner.nextLine();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d. \n", min, max);
        int userNumber = scanner.nextInt();
        while (min > max || max < min){
            return getInt(min, max);
        }
        return userNumber;
    }


//    public int getInt() {
//        System.out.println("Enter a number: ");
//        int userNumber = scanner.nextInt();
////        System.out.printf("You entered %d \n", userNumber);
//        return userNumber;
//    }

//    public int getInt() {
//        System.out.println("Enter a number: ");
//        int userNumber = scanner.nextInt();
//        try {
//            userNumber = Integer.valueOf(this.getString());
//        } catch (NumberFormatException e) {
//            return getInt();
//        }
//        return userNumber;
//    }

    public double getInt() {
        String userInput = getString();
        int userNumber;
        try {
            userNumber = Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getInt();
        }
        return userNumber;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f. \n", min, max);
        double userNumber = scanner.nextDouble();
        if(userNumber > max || userNumber < min){
            return getDouble(min, max);
        }
        return userNumber;
    }

//    public double getDouble() {
//        System.out.println("Enter a number.");
//        double userNumber = scanner.nextDouble();
//        System.out.printf("You entered: %f \n", userNumber);
//        return userNumber;
//    }


    public double getDouble() {
        String userInput = getString();
        double userNumber;
        try {
            userNumber = Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getDouble();
        }
        return userNumber;
    }


}
