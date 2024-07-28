/*An updated version of my calculator from my college classes will make a more advance version eventually.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //inputs
        double num1 = 0;
        double num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner scanObject = new Scanner(System.in);

        try {
            //collects all inputs
            System.out.println("Please enter first number: ");
            num1 = scanObject.nextDouble();

            System.out.println("Please enter second number: ");
            num2 = scanObject.nextDouble();

            System.out.println("What operation? ");
            operator = scanObject.next().charAt(0);

            switch (operator) {
                //all operations
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        answer = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error! Invalid operator.");
                    return;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);

        } catch (InputMismatchException e) {
            System.out.println("Error! Invalid input. Please enter numerical values.");
        } finally {
            scanObject.close();
        }
    }
}

