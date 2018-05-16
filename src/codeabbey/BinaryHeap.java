package codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<Integer> tests = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int a = sc.nextInt();
            tests.add(a);
        }
        List<Integer> result = doCommands(tests);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> doCommands(List<Integer> tests) {
        int count = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (tests.get(i) == 0){
                tests.remove(i);
                count++;
            }
        }

        while (count > 0){
            int min = 100;
            int min2 = getMin(tests,min);
            for (int i = 0; i < tests.size(); i++) {
                if (tests.get(i) == min2){
                    tests.remove(i);
                    count--;
                }
            }

        }
        return tests;
    }


    private static int getMin(List<Integer> tests, int min) {
        for (Integer test : tests) {
            if (test < min){
                min = test;
            }
        }
        return min;
    }
}
