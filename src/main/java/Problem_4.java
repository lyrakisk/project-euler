package main.java;

public class Problem_4 {
    public static void main(String[] args) {
        int max = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product)) {
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(int number) {
        String string = Integer.toString(number);

        StringBuilder builder = new StringBuilder();
        builder.append(string);
        builder.reverse();

        if (string.equals(builder.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
