package openkattis.delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        List<String> result = getResult(a, b, c, d, p, m, g);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static List<String> getResult(int a, int b, int c, int d, int p, int m, int g) {
        List<String> resultList = new ArrayList<>();

        boolean docStatusABP = getDocStatus(a, b, p);
        boolean docStatusCDP = getDocStatus(c, d, p);
        if (docStatusABP && docStatusCDP) {
            resultList.add("both");
        } else if (docStatusABP || docStatusCDP) {
            resultList.add("one");
        } else {
            resultList.add("none");
        }

        boolean docStatusABM = getDocStatus(a, b, m);
        boolean docStatusCDM = getDocStatus(c, d, m);
        if (docStatusABM && docStatusCDM) {
            resultList.add("both");
        } else if (docStatusABM || docStatusCDM) {
            resultList.add("one");
        } else {
            resultList.add("none");
        }

        boolean docStatusABG = getDocStatus(a, b, g);
        boolean docStatusCDG = getDocStatus(c, d, g);
        if (docStatusABG && docStatusCDG) {
            resultList.add("both");
        } else if (docStatusABG || docStatusCDG) {
            resultList.add("one");
        } else {
            resultList.add("none");
        }



        return resultList;
    }

    private static boolean getDocStatus(int aggressive, int calm, int man) {
        List<Integer> list = new ArrayList<>();

        while (list.size() < man) {
            for (int i = 0; i < aggressive; i ++) {
                list.add(1);
            }
            for (int i = 0; i < calm; i ++) {
                list.add(0);
            }
        }

        Integer integer = list.get(man - 1);
        if (integer == 1) {
            return true;
        }
        else return false;


    }
}
