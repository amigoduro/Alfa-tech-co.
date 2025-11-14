// FibonacciFastDoubling.java
import java.math.BigInteger;               // use for 8 byte or more than it
import java.util.Scanner;                // it use for user input

public class Fibb3 {
    // returns {F(n), F(n+1)}
    private static BigInteger[] fibPair(long n)
    
                                                {
                                                    
        if (n == 0) return new BigInteger[]{BigInteger.ZERO, BigInteger.ONE};
        BigInteger[] half = fibPair(n >> 1);
        BigInteger a = half[0]; // F(k)
        BigInteger b = half[1]; // F(k+1)

        BigInteger c = a.multiply(b.shiftLeft(1).subtract(a)); // F(2k) = F(k) * (2*F(k+1) − F(k))
        BigInteger d = a.multiply(a).add(b.multiply(b));      // F(2k+1) = F(k)^2 + F(k+1)^2

        if ((n & 1) == 0)
   {   /// assignation and cross transfering of data fileds 
            return new BigInteger[]{c, d};
                        } 
        else 
                        {
            return new BigInteger[]{d, c.add(d)};
                        }
    }

    public static BigInteger fib(long n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        return fibPair(n)[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to compute F(n): ");
        long n = sc.nextLong();
        System.out.println("F(" + n + ") = " + fib(n));
    }
}
