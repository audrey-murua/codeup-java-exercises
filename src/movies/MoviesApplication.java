package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] movieLibrary = MoviesArray.findAll();
        Input input = new Input();

        while (true) {

            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            int userChoice = (int) input.getInt();
            System.out.printf("You chose %s.\n", userChoice);

            if (userChoice < 0 || userChoice > 5) {
                System.out.println("That's not one of the choices to pick from... Try again.");
            } else if (userChoice == 1) {
                for (Movie movie : movieLibrary) {
                    System.out.println(movie.getCategory() + " - " + movie.getName());
                }
            } else if (userChoice == 2) {
                for (Movie movie : movieLibrary) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getCategory() + " - " + movie.getName());
                    }
                }
            } else if (userChoice == 3) {
                for (Movie movie : movieLibrary) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getCategory() + " - " + movie.getName());
                    }
                }
            } else if (userChoice == 4) {
                for (Movie movie : movieLibrary) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getCategory() + " - " + movie.getName());
                    }
                }
            } else if (userChoice == 5) {
                for (Movie movie : movieLibrary) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getCategory() + " - " + movie.getName());
                    }
                }
            } else if (userChoice == 0) {
                System.out.println("Goodbye!");
                break;
            }


        }


    }

}
