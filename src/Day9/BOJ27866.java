package Day9;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = scanner.nextInt();

        char result = S.charAt(i-1);
        //문자열 S에서 i-1 위치에 있는 문자를 얻어와 result에 저장한다.
        //인덱스는 0부터 시작하므로 입력받은 i에서 -1를 빼야 함.
        System.out.println(result);


    }
}
