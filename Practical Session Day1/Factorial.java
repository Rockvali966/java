import java.math.BigInteger;

public class Factorial  {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int square = i * i;
            BigInteger factorial = findFactorial(square);
            System.out.println("Factorial of " + square + ": " + factorial);
        }
    }

    public static BigInteger findFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
