package homeTasks2;

import java.util.Arrays;
import java.util.Scanner;

public class FahrenheitCelsius2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tests = new int[sc.nextInt()];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = sc.nextInt();
        }
        int[] result = transformToCelsius(tests);
        System.out.println(Arrays.toString(result));
    }

    private static int[] transformToCelsius(int[] tests) {
        for (int i = 0; i < tests.length ; i++) {
            int fahrenheit = tests[i] - 32;
            double  l =  (0.5 / 0.9);
            double f = l * fahrenheit;
            tests[i] = (int) Math.round(f);
        }
        return tests;
    }
}
