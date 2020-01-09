package main.java;

public class Problem_2 {
    public static void main(String[] args) {
        int previous = 1;
        int current = 1;
        int result = 0;

        while (current < 4000000) {
            if (current % 2 == 0) {
                result += current;
            }
            current += previous;
            previous = current - previous;
            System.out.println(current);
        }

        System.out.println(result);
    }
}
