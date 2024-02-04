package Day7;

import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        int A[] = {1,1,2,2,2,8};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int find = scanner.nextInt();
            System.out.println(A[i] - find + "");
        }
    }
}
