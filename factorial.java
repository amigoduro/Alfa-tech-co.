import java.util.Scanner;

public class FactorialOfThreeNumbers {
    
    // Method to calculate factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking 3 numbers as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Calculating factorial of each number
        System.out.println("Factorial of " + num1 + " is: " + factorial(num1));
        System.out.println("Factorial of " + num2 + " is: " + factorial(num2));
        System.out.println("Factorial of " + num3 + " is: " + factorial(num3));

        sc.close();
    }
}
