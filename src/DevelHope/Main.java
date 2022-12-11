package DevelHope;
/**
 * main class takes user inputs and print in console the result of the 4 methods invocations
 * @author Giovanna Fiaccabrino
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("enter second number");
        int num2 = scan.nextInt();
        scan.nextLine();

        System.out.println(arithmeticOperators.sum(num1,num2));
        System.out.println(arithmeticOperators.sub(num1,num2));
        System.out.println(arithmeticOperators.mul(num1,num2));
        System.out.println(arithmeticOperators.div(num1,num2));

    }

}