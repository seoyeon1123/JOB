
package Day9;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int repeat = A / 4;

        for (int i = 0; i < repeat; i++) {
            System.out.print("long ");
        }
        System.out.println("int");

    }
}
