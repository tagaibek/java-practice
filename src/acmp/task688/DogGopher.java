package acmp.task688;


import java.util.Scanner;

public class DogGopher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gopherX = sc.nextInt();
        int gopherY = sc.nextInt();

        int dogX = sc.nextInt();
        int dogY = sc.nextInt();

        int n = sc.nextInt();
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            double a = Math.sqrt((gopherX - x) * (gopherX - x) + (gopherY - y) * (gopherY - y));
            double b = Math.sqrt((dogX - x) * (dogX - x) + (dogY - y) * (dogY - y));

            a += a;
            if (a < b) {
                System.out.println(i+i );
                ok = true;
                break;
            }
        }

        if (!ok) {
            System.out.println("NO");
        }
    }
}
