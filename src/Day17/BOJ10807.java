package Day17;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] arr = new int[num];  // Create an array outside the loop to store all the values

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();  // Read each integer and store it in the array
        }
        int V = scanner.nextInt();

        int count = 0;
        for (int value : arr) {
            if(value == V){
                count ++;
            }
        }
        System.out.println(count);
    }
}