package Day14;

import java.util.Scanner;

public class BOJ5523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] score = new int[5];

        for (int i = 0; i < 5; i++) {
            score[i] = scanner.nextInt();
            sum += score[i];
        }

        System.out.println(sum);
    }
}
