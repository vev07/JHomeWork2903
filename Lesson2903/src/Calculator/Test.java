package Calculator;

import java.util.Scanner;

public class Test {
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
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
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
