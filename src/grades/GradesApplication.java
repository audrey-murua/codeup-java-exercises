package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Link");
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(90);
        students.put("HyruleWarrior", student1);

        Student student2 = new Student("Zelda");
        student2.addGrade(100);
        student2.addGrade(97);
        student2.addGrade(93);
        students.put("PrincessZelda", student2);

        Student student3 = new Student("Navi");
        student3.addGrade(100);
        student3.addGrade(99);
        student3.addGrade(96);
        students.put("Hey-Listen", student3);

        Student student4 = new Student("Ganondorf");
        student4.addGrade(70);
        student4.addGrade(81);
        student4.addGrade(68);
        students.put("Gerudo_Warlock", student4);

        Input input = new Input();


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome!");
            System.out.println("Here are the Github usernames of our students: ");

            for (String userNames : students.keySet()) {
                System.out.print(userNames + " | ");
            }

            System.out.println("");
            System.out.println("What student would you like to see more information on?");

            String userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase( "HyruleWarrior")) {
                System.out.println("Name: " + student1.getName() + " - Github Username: " + userResponse + "\nCurrent Average: " + student1.getGradeAverage());
            } else if (userResponse.equalsIgnoreCase( "PrincessZelda")) {
                System.out.println("Name: " + student2.getName() + " - Github Username: " + userResponse + "\nCurrent Average: " + student2.getGradeAverage());
            } else if (userResponse.equalsIgnoreCase( "Hey-Listen")) {
                System.out.println("Name: " + student3.getName() + " - Github Username: " + userResponse + "\nCurrent Average: " + student3.getGradeAverage());
            } else if (userResponse.equalsIgnoreCase("Gerudo_Warlock")) {
                System.out.println("Name: " + student4.getName() + " - Github Username: " + userResponse + "\nCurrent Average: " + student4.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userResponse);
                System.out.println("Would you like to see another student?");
                if (!userResponse.equalsIgnoreCase("yes")) {
                    System.out.println("Goodbye!");
                    break;
                }
            }

        }


    }



}
