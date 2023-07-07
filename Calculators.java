import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2==0)
                {
                    System.out.println("Error:Divide by zero...");
                }
                else
                {
                    result = num1 / num2;
                    break;
                }
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
