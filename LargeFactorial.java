// Typically, for large numbers, recursion and arrays are not efficient due to the limitations of Java's int.
// Instead, BigInteger in Java should be used for such purposes.

import java.math.BigInteger;

public class LargeFactorial {
    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
    
    public static void main(String[] args) {
        int number = 50;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
