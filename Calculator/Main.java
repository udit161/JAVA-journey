import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result;

        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();

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
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("The result is: " + result);

        sc.close();

    }
}
