package home_tasks;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SumOfDice {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int test = sc.nextInt();
        int result = diceSum(test);
        System.out.println(result);
    }

    private static int diceSum(int test) {
        int firstDice ;
        int secondDice ;
        int count = 0;
        while (true){
            firstDice = ThreadLocalRandom.current().nextInt(1, 7);
            secondDice = ThreadLocalRandom.current().nextInt(1, 7);
            if (firstDice + secondDice == test  ) return count;
            count++;
        }
    }
}
