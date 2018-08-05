package home_tasks;

import java.util.Scanner;

public class HappyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int happyNum = sc.nextInt();
        int[] result = firstTenNum(happyNum);
        System.out.println("First"+ happyNum + " Happy numbers:");
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] firstTenNum(int happyNum) {
        int[] result = new int[happyNum];
        int j = 0;
        int i = 0;
        while (j < happyNum) {
            i++;
            int happy = find_1(i);
            if (happy == 1) {
                result[j++] = i;
            }
        }
        return result;
    }

    private static int find_1(int happy) {
        while (happy != 1) {
            int a;
            int b;
            if (happy < 100) {
                a = happy / 10;
                b = happy % 10;
                happy = a * a + b * b;
            } else {
                a = happy / 100;
                int c = happy % 100;
                b = c / 10;
                c = c % 10;
                happy = a * a + b * b + c * c;
            }
            if (happy < 10) {
                return happy;
            }
        }
        return happy;
    }
}
