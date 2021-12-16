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




        }
    }