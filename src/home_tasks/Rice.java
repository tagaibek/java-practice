package home_tasks;

import java.util.Scanner;

public class Rice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rice1kilos = sc.nextInt();
        int rice5kilos = sc.nextInt();
        int goal = sc.nextInt();
        boolean result = packageOfRise(rice1kilos, rice5kilos, goal);
        System.out.println(result);
    }

    private static boolean packageOfRise(int rice1kilos, int rice5kilos, int goal) {
        if ((goal <= 5 && rice1kilos >= goal) || (goal > 5 && goal <= rice1kilos + 5 )) {
            return true;
        } else if (goal > 5 + rice1kilos) {
            int sum = 0;
            while (rice5kilos != 0) {
                sum += 5;
                if (sum + rice1kilos >= goal) {
                    return true;
                }
                rice5kilos--;
            }
        }


        return false;
    }
}
