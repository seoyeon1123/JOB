package Day9;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < A; i++) {
            String text = scanner.nextLine();
            String answer = text.substring(0,1) + text.substring(text.length()-1);
            System.out.println(answer);
        }

    }
}
