// FibonacciIterative.java
import java.math.BigInteger;              //Specific maths file for 8b.
import java.util.Scanner;                //common header file


public class Fibb1 {
    // returns Fibonacci(n) (0-indexed: F(0)=0, F(1)=1)
    public static BigInteger fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");        // variable assignation 
        if (n == 0) return BigInteger.ZERO;                                        //  using condition for false  statement proving 
        if (n == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO; // F(0)
        BigInteger b = BigInteger.ONE;  // F(1)
        for (int i = 2; i <= n; i++) {            
                                                // what if we use i=2;i<=n;i=i+1
            BigInteger next = a.add(b);
            a = b;
            b = next;
            
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (print first N Fibonacci numbers): ");                //  this will be an output for the gui
        int N = sc.nextInt();
        
        if (N <= 0) {
            System.out.println("Nothing to print for N <= 0");
            return;
        }

        for (int i = 0; i < N; i++) {
            System.out.println("F(" + i + ") = " + fib(i));
        }
    }
}
