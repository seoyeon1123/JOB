package Day13;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray();
        for(int i=0; i < text.length; i++){
            char temp = text[i];

            if (temp>='a' && temp<='z'){
                System.out.print((char) (temp-32));
                //대문자와 소문자 간의 차이 = 32
            } else System.out.print((char) (temp + 32));
        }

    }
}
