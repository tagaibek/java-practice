package codeabbey;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int[] ints = new int[nextInt];
        for (int i = 0; i < nextInt ; i++) {
            ints[i] = sc.nextInt();
        }
        int[] result = transform(ints);
        System.out.println("answer: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] transform(int[] ints) {
        int i = 0;
        for (int farInt:ints) {
            int num = farInt - 32;
            double  l =  (0.5 / 0.9);
            double f = l * num;
            int a = (int) Math.round(f);
            ints[i] = a;
            i++;
        }
        return ints;
    }
}
