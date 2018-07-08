package codeabbey;

import java.util.*;

public class BinaryHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        //Map<Integer, Map.Entry<Integer, Integer>> heap = new LinkedHashMap<>();

        List<Integer> heap = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int a = sc.nextInt();

            if (a == 0 && !heap.isEmpty()) {
                heap.remove(0);
                if (heap.size() > 1) {
                    int lastNum = heap.get(heap.size() - 1);
                    heap.set(0, lastNum);
                }

                fixHeavyTopHeap(heap);
            } else {
                heap.add(a);
                fixLightBottomHeap(heap);
            }
        }

        for (Integer integer : heap) {
            System.out.print(integer + " ");
        }
    }

    //3 9 6 5 => 3 5 6 9
    //3 1 => 1 3
    private static void fixLightBottomHeap(List<Integer> heap) {
        if (heap.size() <= 1) {
            return;
        }

        int numberIndex = heap.size() - 1;
        int number = heap.get(numberIndex);
        int rootIndex = findRootIndex(heap, numberIndex);

        while (number < heap.get(rootIndex)) {

            //swap with root
            int tmp = heap.get(rootIndex);
            heap.set(rootIndex, number);
            heap.set(numberIndex, tmp);

            //set the next iteration
            numberIndex = rootIndex;
            rootIndex = findRootIndex(heap, numberIndex);
        }
    }

    private static void fixHeavyTopHeap(List<Integer> heap) {
    }

    private static int findRootIndex(List<Integer> heap, final int numberIndex) { //4

        int n = 0;
        int index = 0;
        while(numberIndex > index) {//4 > 0 | 4 > 2
            n++;// 1 | 2
            index += Math.pow(2, n); // 2  | 6 index = 6
        }

        int remainingLeaves = index - numberIndex; // 6 - 4 = 2
        int numberLevelIndex = (int) Math.pow(2, n) - remainingLeaves; // 4 - 2 = 2
        int rootLevelIndex = numberLevelIndex / 2 + numberLevelIndex % 2; // 2 / 2 + 0 = 1
        int rootIndex = (int) Math.pow(2, n - 2) + rootLevelIndex; // 0 +

        return rootIndex;
    }
}
