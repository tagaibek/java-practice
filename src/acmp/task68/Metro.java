package acmp.task68;

import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        int x = sc.nextInt();
        String result = (ch == 'H' && x % 2 == 0 || ch == 'S' && x % 2 != 0) ? "Yes" : "No";

        System.out.println(result);
    }
}
