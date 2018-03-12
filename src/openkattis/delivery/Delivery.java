package openkattis.delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int p = sc.nextInt();
        int m = sc.nextInt();
        int g = sc.nextInt();

        //diamond generics
        List<String> result = getResult(a, b, c, d, p, m, g);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static List<String> getResult(int a, int b, int c, int d, int p, int m, int g) {
        List<String> resultList = new ArrayList<>();

        boolean aggressiveABP = isAggressive(a, b, p);
        boolean aggressiveCDP = isAggressive(c, d, p);
        if (aggressiveABP && aggressiveCDP) {
            resultList.add("both");
        } else if (aggressiveABP || aggressiveCDP) {
            resultList.add("one");
        } else {
            resultList.add("none");
        }

        boolean aggressiveABM = isAggressive(a, b, m);
        boolean aggressiveCDM = isAggressive(c, d, m);
        if (aggressiveABM && aggressiveCDM) {
            resultList.add("both");
        } else if (aggressiveABM || aggressiveCDM) {
            resultList.add("one");
        } else {
            resultList.add("none");
        }

        boolean aggressiveABG = isAggressive(a, b, g);
        boolean aggressiveCDG = isAggressive(c, d, g);
        if (aggressiveABG && aggressiveCDG) {
            resultList.add("both");
        } else if (aggressiveABG || aggressiveCDG) {
            resultList.add("one");
        } else {
            resultList.add("none");
        }

        return resultList;
    }

    private static boolean isAggressive(int aggressive, int calm, int man) {
        List<Integer> list = new ArrayList<>();

        while (list.size() < man) {
            IntStream.range(0, aggressive).forEach(i->list.add(1));
            IntStream.range(0,calm).forEach(i->list.add(0));
        }

        Integer integer = list.get(man - 1);
        return integer == 1;
    }
}
