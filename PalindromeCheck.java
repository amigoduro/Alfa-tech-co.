// PalindromeCheck.java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();

        // Normalize input (optional: remove spaces and lowercase for words)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome ");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome ");
        }
    }
}
