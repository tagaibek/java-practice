package homeTasks2;

import java.util.Scanner;

public class Poe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tests = new int[sc.nextInt()];
        for (int i = 0; i <tests.length ; i++) {
            tests[i] = sc.nextInt();
        }
        int result = ifPoe(tests);
        System.out.println(result);
    }

    private static int ifPoe(int[] tests) {
        int sum1;
        for (int i = 0; i < tests.length; i++) {
             sum1 =+ tests[i];
            int sum2 = 0;
            for (int j = i + 2; j < tests.length; j++){
                sum2 += tests[j];
            }
            if (sum2 == sum1){
                return i + 1;
            }
        }
        return -1;
    }
}
