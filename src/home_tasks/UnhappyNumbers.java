package home_tasks;

import java.util.Scanner;

public class UnhappyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int happyNum = sc.nextInt();
        String result = isNumber_h_u(happyNum);
        System.out.println("The " + happyNum + " is "  + result );
    }

    private static String isNumber_h_u(int happyNum) {
        while (happyNum != 1) {
            int a;
            int b;
            if (happyNum < 100) {
                a = happyNum / 10;
                b = happyNum % 10;
                happyNum = a * a + b * b;
            } else {
                a = happyNum / 100;
                int c = happyNum % 100;
                b = c / 10;
                c = c % 10;
                happyNum = a * a + b * b + c * c;
            }
            if (happyNum < 10) {
                break;
            }
        }
        return happyNum == 1 ? "Happy Number" : "Unhappy Number";
    }
}
