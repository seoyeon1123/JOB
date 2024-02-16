package Day12;

import java.util.Scanner;

public class BOJ2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long sum = Math.abs(A-B);
        //주어진 숫자의 절대값을 반환하는 메서드이다.즉,
        // 어떤 숫자가 음수이든 양수이든 상관없이 그 수의 절대값을 돌려준다.

        System.out.println(sum);

    }
}
