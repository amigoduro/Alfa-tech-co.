// FibonacciMemo.java
import java.math.BigInteger;                                        // for long integer
import java.util.HashMap;                                            // mainly for hsab script
import java.util.Map;
import java.util.Scanner;

public class Fibb2 {
    private static Map<Integer, BigInteger> memo = new HashMap<>();
    

    static {
        memo.put(0, BigInteger.ZERO);
        memo.put(1, BigInteger.ONE);
    }

    public static BigInteger fib(int n)
    {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (memo.containsKey(n)) return memo.get(n);
        BigInteger result = fib(n - 1).add(fib(n - 2));
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to compute F(n): ");
        int n = sc.nextInt();
        System.out.println("F(" + n + ") = " + fib(n));
    }
}
