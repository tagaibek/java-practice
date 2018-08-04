package home_tasks;

import java.util.Scanner;

public class LucasNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ten = sc.nextInt();
        int[] result = new int[ten];
        int num1 = 2;
        int num2 = 1;
        result[0] = num1; result[1] = num2;
        for (int i = 2; i < result.length; i++) {
            result[i] = num1 + num2;
            num1 = num2;
            num2 = result[i];
        }
        System.out.println("First ten Lucas a numbers:");
        for (int i : result) {
            System.out.println(i);
        }
    }
}
