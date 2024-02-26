package Day16;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] arr = new int[N];

        for (int i = 0; i <N ; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
