package Calculator;

import java.util.Scanner;

public class Calculator {
    public void Calculator() {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        System.out.print("enter first number: ");
        num1 = input.nextDouble();
        System.out.print("enter second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter the operation (+, -, *, /): ");
        String operator = input.next();
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                result = num1 / num2;
                if  (num2 == 0) {
                    System.out.println("Number cannot be 0...not divisible");
                }
                else {
                    System.out.println("result: "+result);
                }

                break;
            default:
                System.out.println("Invalid operator ");
                break;
        }
    }
}
