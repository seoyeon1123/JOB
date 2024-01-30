package Day2;

import java.util.Scanner;

public class BOJ10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // 행의 수(N)만큼 반복하는 외부 루프
        for (int i = 0; i < N; i++) {
            // 각 행마다 별표를 출력하는 내부 루프
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // 현재 행의 별표 출력이 끝나면 다음 줄로 이동
            System.out.println();
        }


    }
}
