package codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Savings_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        List<int[]> moneyPercent = new ArrayList<>();
        for (int i = 0; i < testNum; i++) {
            int[] ints = new int[3];
            for (int j = 0; j < 3 ; j++) {
                int nextInt = sc.nextInt();
                ints[j] = nextInt;
            }
            moneyPercent.add(ints);
        }
        int[] result = findYear(moneyPercent);
        System.out.println("answer:");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }

    private static int[] findYear(List<int[]> moneyPercent) {
        int result[] = new int[moneyPercent.size()];
        int i = 0;
        for (int[] test: moneyPercent) {
            int initial_amount = test[0];
            int final_amount = test[1];
            int percent = test[2];
            int year ;
            int month =0 ;
            while (initial_amount < final_amount){
                initial_amount += (percent* initial_amount)/ (12 * 100) ;
                month++;
            }
            year = month / 12;
            result[i] = year;
            i++;
        }
        return result;
    }
}
