package Day3;

import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        System.out.println(total);
    }
}
