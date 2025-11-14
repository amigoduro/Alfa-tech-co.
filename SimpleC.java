import java.util.Scanner;

public class SimpleC {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input operation
        System.out.println("Choose an operation: +  -  *  /");
        char operator = sc.next().charAt(0);

        double result = 0;                        // for identification
        boolean valid = true;

        switch (operator) {
            case '+':  // switch logic
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, * or /.");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
