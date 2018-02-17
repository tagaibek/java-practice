package openkattis.numberfun;

import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result[] = getFun(n, sc);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static String[] getFun(int n, Scanner sc) {
        String[] strMass = new String[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = sc.nextInt();
            String answer = (a + b == result || Math.abs(a - b) == result || a * b == result ||
                    (a / b == result && a % b == 0) || (b / a == result && b % a == 0)) ? "Possible" : "Impossible";

            strMass[i] = answer;
        }

        return strMass;
    }
}
