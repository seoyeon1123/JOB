package Day11;

import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String a = scanner.next();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum +=a.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
        //그리고 다음 줄에 숫자를 정수가 아닌 String (문자열)로 입력을 받는다.
        //
        //그리고 for문을 통해 입력받은 문자열의 첫번째 원소 ( charAt(0) ) 부터 마지막 원소 ( charAt(N) ) 까지 각 원소의 누적 합을 구하면 된다.
        //
        //이 때, charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
