package main.java;

import static main.java.Problem_3.isPrime;

public class Problem_7 {
    public static void main(String[] args) {
        int count = 1;
        int i = 3;
        while (count < 10001) {
            if (isPrime(i)) {
                count++;
            }
            i += 2;
        }
        System.out.println("result: " + (i - 2)); // subtract 2 from i to get the correct result
    }
}
