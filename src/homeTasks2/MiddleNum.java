package homeTasks2;

import java.util.Scanner;

public class MiddleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int result = 0;
        if (len % 2 !=0){
            int[] tests = new int[len];
            for (int i = 0; i <tests.length ; i++) {
                tests[i] = sc.nextInt();
            }
            result = findMid(tests);
        }
        System.out.println(result);
    }

    private static int findMid(int[] tests) {
        int mid = tests.length / 2;
        for (int i : tests) {
            if (tests[mid] > i){
                return 0;
            }
        }
        return 1;
    }
}
