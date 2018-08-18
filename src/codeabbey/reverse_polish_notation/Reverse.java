package codeabbey.reverse_polish_notation;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int result = calculate(str);
        System.out.println();
    }

    private static int calculate(String str) {
        String[] strings = str.split(" ");
        for (String s : strings) {
        }
        return 0;
    }
}
