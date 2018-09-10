package hackerrank;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SeparateTheNumbers {
    private static final Scanner scanner = new Scanner(System.in);
    static PrintWriter out;

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            if (s.charAt(0) == '0' || s.charAt(1) == '0' || s.length() < 3 ) {
                out = new PrintWriter(new OutputStreamWriter(System.out));
                continue;
            }
            separateNumbers(s);
        }
        scanner.close();
    }

    private static void separateNumbers(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

        }
    }
}
