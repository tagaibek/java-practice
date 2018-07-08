package codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            int value = sc.nextInt();
            if (value == -1){
                break;
            }
            else {
                list.add(value);
            }
        }
        int c = removeIndex(list);
        int result = checkSum(list);
        System.out.println(c + " " + result);
    }

    private static int checkSum(List<Integer> list) {
        int result = 0;
        int seed = 113;
        int limit = 10000007;
        for (int i = 0; i < list.size(); i++) {
            result = (result + list.get(i)) * seed;
            if (result >= limit ){
                result = result % limit;
            }
        }
        return result;
    }

    private static int removeIndex(List<Integer> list) {
        int count = 0;
        int indexValue1;
        for (int i = 0; i < list.size() - 1 ; i++) {
            if (list.get(i) > list.get(i + 1)){
                indexValue1 = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, indexValue1);
                count++;
            }
        }
        return count;
    }
}
