package Day18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();

        for (int i = 1; i <= 10 ; i++) {
            h.add(scanner.nextInt()%42);
        }
        System.out.println(h.size());
    }
}
