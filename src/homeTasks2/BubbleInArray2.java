package homeTasks2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleInArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listInt = new ArrayList<>();
        while (true){
            int num = sc.nextInt();
            if (num != -1){
                listInt.add(num);
            }
            else break;
        }
        System.out.println(countOfSort(listInt) + " " + checkSum(listInt));
    }

    private static int checkSum(List<Integer> listInt) {
        int result = 0;
        for (int indexNum : listInt) {
            result = (result + indexNum) * 113;
            if (result >= 10000007) {
                result = result % 10000007;
            }
        }
        return result;
    }

    private static int countOfSort(List<Integer> listInt) {
        int count = 0;
        int index ;
        for (int i = 0; i < listInt.size() - 1; i++) {
            index = listInt.get(i);
            if (index > listInt.get(i + 1)){
                listInt.set(i, listInt.get(i + 1));
                listInt.set(i + 1, index);
                count++;
            }
        }
        return count;
    }
}
