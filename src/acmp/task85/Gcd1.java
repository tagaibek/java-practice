package acmp.task85;


import java.io.IOException;
import java.util.Scanner;

public class Gcd1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = getGcd(n, m);
        System.out.println(result);
    }

    private static int getGcd(int n, int m) {
        String one = "";
        String one2 = "";
        for (int i = 1; i <= m; i++){
            one += "1";
        }
        for (int i = 1; i <= n; i++){
            one2 += "1";
        }
        int oneN = Integer.parseInt(one2);
        int oneM = Integer.parseInt(one);
        int gcd = 0;
        int min;

        if (oneM > oneN){ min = oneM;}
        else min = oneN;
        for (int i = 1; i <= min; i++){
            if ((oneM % i == 0) && (oneN % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}

