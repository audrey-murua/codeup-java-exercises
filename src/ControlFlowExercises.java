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















        }
    }