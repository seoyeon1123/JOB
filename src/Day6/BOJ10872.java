package Day6;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N <2){
            System.out.println(1);
        } else {
            int fac = 1;
            for (int i = 2; i <= N; i++) {
                fac = fac * i;
            }
            System.out.println(fac);
        }


    }
}