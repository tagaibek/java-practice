package home_tasks;

import java.util.Random;
import java.util.Scanner;

public class SumOfDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        try {
            int result = diceSum(test);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int diceSum(int total) {
        int firstDice;
        int secondDice;
        int count = 0;

        if (total < 2 || total > 12) {
            throw new IllegalArgumentException("Test bigger 12 or less than 2");
        }

        while (true) {
            Random random = new Random();
            firstDice = random.nextInt(6) + 1;
            secondDice = random.nextInt(6) + 1;
            System.out.printf("%d, %d\n", firstDice, secondDice);

            if (firstDice + secondDice == total) {
                return count;
            }

            count++;
        }
    }
}
