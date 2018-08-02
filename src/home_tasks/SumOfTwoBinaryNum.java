package home_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfTwoBinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstBin = sc.nextInt();
        int secondBin = sc.nextInt();

        List<Integer> result = sumBin(secondBin, firstBin);

        for (int i = result.size()-1; i >= 0; i--){
            System.out.print(result.get(i));
        }
        System.out.println("\n");
    }

    private static List<Integer> sumBin(int secondBin, int firstBin) {
        List<Integer> sumInt = new ArrayList<>();
        int remainder = 0;

        while (secondBin !=0 || firstBin !=0){
            sumInt.add(((secondBin % 10 + firstBin % 10 + remainder) % 2));
            remainder = (secondBin % 10 + firstBin % 10 + remainder) / 2;
            secondBin = secondBin / 10;
            firstBin = firstBin / 10;
        }
        if (remainder != 0){
            sumInt.add(remainder);
        }

        return sumInt;
    }
}
