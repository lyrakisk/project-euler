package main.java;

import java.io.File;
import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/problem_11.txt");
        try {
            Scanner sc = new Scanner(file);

            // read the first line to create the NxN array (assume the file contains NxN numbers).
            String line = sc.nextLine();
            String[] lineNumbers = line.split(" ");
            int[][] numbers = new int[lineNumbers.length][lineNumbers.length];
            int i = 0;

            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = Integer.parseInt(lineNumbers[j]);
            }

            while (sc.hasNextLine()) {
                i++;
                line = sc.nextLine();
                lineNumbers = line.split(" ");
                for (int j = 0; j < numbers.length; j++) {
                    numbers[i][j] = Integer.parseInt(lineNumbers[j]);
                }
            }

            int max = 0;
            for (i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (i < numbers.length - 3 && j < numbers.length - 3) {
                        int rightDiagonalProduct = numbers[i][j] * numbers[i + 1][j + 1] * numbers[i + 2][j + 2] * numbers[i + 3][j + 3];
                        max = Math.max(max, rightDiagonalProduct);
                    }
                    if (i < numbers.length - 3) {
                        int rightProduct = numbers[i][j] * numbers[i + 1][j] * numbers[i + 2][j] * numbers[i + 3][j];
                        max = Math.max(max, rightProduct);
                    }
                    if (j < numbers.length - 3) {
                        int downProduct = numbers[i][j] * numbers[i][j + 1] * numbers[i][j + 2] * numbers[i][j + 3];
                        max = Math.max(max, downProduct);
                    }
                    if (i < numbers.length - 3  && j > 2) {
                        int leftDiagonalProduct = numbers[i][j] * numbers[i + 1][j - 1] * numbers[i + 2][j - 2] * numbers[i + 3][j - 3];
                        max = Math.max(max, leftDiagonalProduct);
                    }
                }
            }

            System.out.println("max product: " + max);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return;
        }
    }
}
