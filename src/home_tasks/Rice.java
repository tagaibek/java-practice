package home_tasks;

import java.util.Scanner;

public class Rice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rice1kilos = sc.nextInt(); //100 > 99
        int rice5kilos = sc.nextInt(); //0 : 100000
        int goal = sc.nextInt();
        boolean result = packageOfRise2(rice1kilos, rice5kilos, goal);
        System.out.println(result);
    }

    private static boolean packageOfRise2(int rice1kilos, int rice5kilos, int goal) {
        if (goal >= rice5kilos * 5) {
            goal -= rice5kilos * 5;
        } else {
            goal %= 5;
        }

        return rice1kilos - goal >= 0;
    }

    private static boolean packageOfRise(int rice1kilos, int rice5kilos, int goal) {
        if (rice1kilos == 0 && rice5kilos > 0 && goal % 5 == 0 ||
                rice5kilos == 0 && rice1kilos > 0 && goal <= rice1kilos) {
            return true;
        } else if (rice1kilos > 0 && rice5kilos > 0) {
            int[] ints = new int[rice5kilos];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = 5;
            }
            int sum = 0;
            for (int i : ints) {
                sum += i;
                if (sum < goal) {
                    if (sum + rice1kilos >= goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
