package Day18;

import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cycle = 0;
        int copy = n;

        while (true){
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cycle++;

            if (n == copy){
                break;
            }

        }
        System.out.println(cycle);


    }

}
