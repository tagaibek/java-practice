package home_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        int listSize = sc.nextInt();
        int arraylength = sc.nextInt();
        for (int i = 0; i < listSize ; i++) {
            int[] arrInt = new int[arraylength];
            for (int j = 0; j < arrInt.length; j++) {
                arrInt[j] = sc.nextInt();
            }
            list.add(arrInt);
        }
        list = sortOfInt(list);
        for (int[] i : list) System.out.println(Arrays.toString(i));
        System.out.println();
    }

    private static List<int[]> sortOfInt(List<int[]> list) {
        List<int[]> result = new ArrayList<>();
        int index ;
        while (list.size()!= 0){
            index = listSort(list);
            result.add(list.get(index));
            list.remove(index);
        }
        for (int[] i : result) {
            Arrays.sort(i);
        }
        return result;
    }

    private static int listSort(List<int[]> list) {
        int res = 0;
        int min = 1000;

        for (int j = 0; j < list.size(); j++) {
            int min2 = 0;
            for (int i : list.get(j)) {
                min2 += i;
            }
            if (min2 < min ){
                min = min2;

                res = j;
            }
        }
        return res;
    }
}
