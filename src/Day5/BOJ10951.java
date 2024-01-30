package Day5;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){ // scanner.hasNext() --> 다음에 받을게 있는지 여부를 찾는 것
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }

    }
}
