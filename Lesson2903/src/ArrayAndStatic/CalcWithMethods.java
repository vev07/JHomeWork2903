package ArrayAndStatic;

import java.util.Scanner;


public class CalcWithMethods {
    public static double add(int a, int b) {
        return a + b;
    }
    public static double minus(int a, int b) {
        return a - b;
    }
    public static double multiplication(int a, int b) {
        return a * b;
    }
    public static double division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("If you want something calculate you need to press any button other than 'q'");

        char exit = scanner.next().charAt(0);

        while (exit != 'q') {
            System.out.println("Enter number");
            int a = scanner.nextInt();

            System.out.println("Enter other number");
            int b = scanner.nextInt();

            System.out.println("Enter what do you want do this numbers. Example +,-,/,*");
            char done = scanner.next().charAt(0);

            double result;

            switch (done) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = minus(a, b);
                    break;
                case '*':
                    result = multiplication(a, b);
                    break;
                case '/':
                    result = division(a, b);
                    break;
                default:
                    System.out.println("You enter something wrong");
                    return;

            }

            System.out.println("Solution: " + result);
            System.out.println("If you want something calculate you need to press any button other than 'q'");
            exit = scanner.next().charAt(0);


        }

    }
}
