package home_tasks;

import java.util.Scanner;

public class Recurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 0) {
            double result = f(n);
            System.out.println(result);
        } else System.out.println(-1);
    }


    private static double f(int n) {
        if(n == 0) return 2.;
        return  1 + (1 / (f(n-1) + 1));
    }
}
