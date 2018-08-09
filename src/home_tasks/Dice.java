package home_tasks;


import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public static void main(String[] args) {
        int result = eyes();
        System.out.println(result);
    }

    private static int eyes() {
        int firstDice;
        int secondDice;
        int count = 0;
        while (true) {
            firstDice = ThreadLocalRandom.current().nextInt(1, 7);
            secondDice = ThreadLocalRandom.current().nextInt(1, 7);
            if (firstDice == 1 && secondDice == 1) return count;
            count++;
        }
    }
}
