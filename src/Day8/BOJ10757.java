package Day8;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10757 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        BigInteger sum = A.add(B);

        System.out.println(sum);
    }
}
