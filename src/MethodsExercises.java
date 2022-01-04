import java.util.Scanner;

public class MethodsExercises {


    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getDifference(int x, int y) {
        return x - y;

    }

    public static int getProduct(int i, int j) {
        return i * j;

    }

    public static int getQuotient(int num1, int num2) {
        return num1 / num2;

    }

    public static int getModulus(int number1, int number2) {
        return number1 % number2;

    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1 - 10: ");
        int result = scanner.nextInt();

        if (min <= result && max >= result) {
            return result;
        }
        System.out.println("Error! Enter another number: ");
        return getInteger(min,max);
    }

    public static long getFactorial (int num1) {

        long factorial = 1;
        for (int i = 2; i <= num1; i++) {
            factorial *= i;
        }
        return factorial;
    }

//    public static long getDice (int dice1, int dice2) {
//
//
//
//
//    }

    public static void main(String[] args) {

        System.out.println(getSum(5,10));
        System.out.println(getDifference(15,10));
        System.out.println(getProduct(5,10));
        System.out.println(getQuotient(50,10));
        System.out.println(getModulus(50,10));

        System.out.println(getInteger(1, 10));

        System.out.println(getFactorial(4));







    }










}
