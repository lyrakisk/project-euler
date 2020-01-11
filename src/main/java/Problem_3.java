package main.java;

/**
 * Finds the largest prime factor of a number.
 * This solution is based on the fact that each integer
 * has a unique prime factorization (Fundamental Theorem of Arithmetic).
 */
public class Problem_3 {
    public static void main(String[] args) {
        long number = 600851475143L;

        long i = 3L;

        while (number > 1) {
            if (isPrime(i)) {
                while (number % i == 0) {
                    number = number / i;
                }
            }
            i += 2;
        }

        System.out.println(i - 2);
    }

    /**
     * Checks whether the given number is prime or not.
     * @param x number to examine (long).
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(long  x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i < (x / 2 + 1); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
