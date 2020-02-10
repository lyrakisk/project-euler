package main.java;

import java.math.BigInteger;


import static main.java.Problem_3.isPrime;

public class Problem_10 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        // 0 : number not checked
        // 1 : number checked
        int[] numbers = new int[2000000];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < 2000000; i++) {
            if (numbers[i] == 0) {
                if (isPrime(i)) {
                    sum = sum.add(new BigInteger(Integer.toString(i)));
                }
            }
            int k = i * 2;
            while (k < 2000000) {
                numbers[k] = 1;
                k += i;
            }
        }
        System.out.println("Result: " + sum.toString());
    }
}
