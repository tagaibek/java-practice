package mum;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
        int N = sc.nextInt();

        int result = isPairedN(arr, N);

        System.out.println(result);
    }

    private static int isPairedN(int[] arr, int N) {
        if (arr.length < 2) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == N && arr[i] + arr[j] == N) {
                    return 1;
                }
            }
        }

        return 0;
    }
}
