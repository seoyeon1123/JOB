package Day5;

import java.util.Scanner;

public class JOB11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int sum = A + B;
            System.out.println("Case #" + i + ": "+ A + " + " + B +" = " + sum);

        }

    }
}
