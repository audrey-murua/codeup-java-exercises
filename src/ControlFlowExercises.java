import java.util.Scanner;

public class ControlFlowExercises {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //question 1.a

            int i = 5;
//            Create a while loop that runs so long as i is less than or equal to 15
//            Each loop iteration, output the current value of i, then increment i by one.
//
//            Your output should look like this:
//
//            5 6 7 8 9 10 11 12 13 14 15

            while ( i <= 15 ) {
                System.out.printf("%s ", i);
                i++;
            }

            //question 1.b

//            Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
            int x = 0;

            do {
                System.out.println(x);
                x+=2;
            } while (x <= 100);

//            Alter your loop to count backwards by 5's from 100 to -10.

            int a = 100;

            do {
                System.out.println(a);
                a-=5;
            } while (a >= -10);


//            Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//            2
//            4
//            16
//            256
//            65536

            long b = 2;

            do {
                System.out.println(b);
                b *= b;
            } while (b < 1000000);

            //question 1.c
//            Refactor the previous two exercises to use a for loop instead.

//            Create a while loop that runs so long as i is less than or equal to 15
            for(int c = 5; c <= 15; c++) {
                System.out.printf("%s ", c);
            }

//            Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
            for(int d = 0; d <= 100; d+=2) {
                System.out.println(d);
            }

//            Alter your loop to count backwards by 5's from 100 to -10.

            for(int e = 100; e >= -10; e-=5) {
                System.out.println(e);
            }


//            Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//            2
//            4
//            16
//            256
//            65536

            for(long f = 2; f <= 1000000; f*=f) {
                System.out.println(f);
            }



//          Question 2  Fizzbuzz
//
//            One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                    Write a program that prints the numbers from 1 to 100.
//            For multiples of three: print “Fizz” instead of the number.
//            For the multiples of five: print “Buzz”.
//            For numbers which are multiples of both three and five: print “FizzBuzz”.

            for(int g = 1; g <= 100; g++) {

                if (g % 15 == 0)
                    System.out.println("FizzBuzz");
                else if (g % 5 == 0)
                    System.out.println("Buzz");
                else if (g % 3 == 0)
                    System.out.println("Fizz");
                else
                    System.out.println(g);

            }


            //Question 3

//            Display a table of powers.
//
//                    Prompt the user to enter an integer.
//            Display a table of squares and cubes from 1 to the value entered.
//            Ask if the user wants to continue.
//            Assume that the user will enter valid data.
//            Only continue if the user agrees to.
//
//            Example Output
//            What number would you like to go up to? 5
//
//            Here is your table!
//
//                    number | squared | cubed
//                    ------ | ------- | -----
//                    1      | 1       | 1
//            2      | 4       | 8
//            3      | 9       | 27
//            4      | 16      | 64
//            5      | 25      | 125

            //other solution

//            System.out.print("What number would you like to go up to? ");
//            int userInt = scanner.nextInt();
//            System.out.println("");
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int j = 1; j <= userInt; j++){
//                System.out.println(j + "      | " + (j * j) + "       |" + "  " +(j * j * j));
//            }


            String choice = "y";
            do
            {

                // Get input from the user
                System.out.print("Enter an integer: ");
                int integer = scanner.nextInt();

                // Create a header
                String header = "Number  " + "Squared " + "Cubed   " + "\n"
                        +   "======  " + "======= " + "=====   ";
                System.out.println(header);

                int square = 0;
                int cube = 0;

                String row = "";
                for (int j = 1; j <= integer; j++)
                {

                    square = j * j;
                    cube = j * j * j;

                    row = j + "       " + square + "       " + cube;
                    System.out.println(row);
                }

                // See if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = scanner.next();
                System.out.println();

            }
            while (!choice.equalsIgnoreCase("n"));










        }
    }