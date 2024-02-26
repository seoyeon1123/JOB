package Day16;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[9];

        int max = arr[0];
        int max_index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] > max) {
                max = arr[i];
                max_index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(max_index);



    }
}
