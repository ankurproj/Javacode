//Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char calc;
        System.out.println("Enter first number");
        double num1 = scn.nextDouble();
        System.out.println("Enter second number");
        double num2 = scn.nextDouble();
        double ans;
        System.out.println("Enter an operator: '+', '-', '*', '/' ");
        calc = scn.next().charAt(0);
        switch (calc){
            case '+':
                ans = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + ans);
                break;
            case '/':
                ans = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + ans);
                break;

        }

    }
}