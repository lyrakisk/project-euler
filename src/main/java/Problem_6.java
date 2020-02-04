package main.java;

public class Problem_6 {
    public static void main(String[] args) {
        int sum = 0;
        int sumSQ = 0;
        for (double i = 1; i <= 100; i++) {
            sum += i;
            sumSQ += i * i;
        }
        sum *= sum;
        System.out.println(sum - sumSQ);
    }
}
