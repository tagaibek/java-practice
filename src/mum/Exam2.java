package mum;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();

        int result = is121(arr);
        System.out.println(result);
    }

    private static int is121(int[] arr) {
        int start1 = 0;
        boolean is2 = false;
        int end1 = 0;


        for (int a : arr) {
            if (a != 1 && a != 2) {
                return 0;
            }

            if (a == 1) {
                if (is2)
                    end1++;
                else
                    start1++;
            } else {
                if (end1 > 0)
                    return 0;
                else
                    is2 = true;
            }
        }

        return start1 == end1 ? 1 : 0;
    }
}
