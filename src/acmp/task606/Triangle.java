package acmp.task606;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String result = (a + b <= c || b + c <= a || c + a <= b) ? "No" : "Yes";
        System.out.println(result);
    }
}
