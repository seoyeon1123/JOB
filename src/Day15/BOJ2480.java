package Day15;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();

        int[] arrays = {val1, val2, val3};
        Arrays.sort(arrays);

        int price = 0;
        if (val1 == val2 && val2 == val3) {
            price = 10000 + (val1 * 1000);
        } else if(val1 == val2 || val1 == val3 || val2==val3) {
            price = 1000 + arrays[1] * 100;
        } else {
            price = arrays[2] * 100;
        }
        System.out.println(price);


    }
}
