package openkattis.synch;

import java.util.*;

public class Synchronizinglists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            List<Integer> orderedList = getOrder(n, sc);
            if (n == 0) {
                break;
            }
            print(orderedList);
        }
    }

    private static void print(List<Integer> list) {
        for ( Integer i : list) {
            System.out.println(i);
        }
        System.out.println();
    }

    private static List<Integer> getOrder(int n, Scanner sc) {
        if (n == 0) {
            return null;
        }

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        List<Integer> res = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            res.add(0);
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        Map<Integer, Integer> viMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            viMap.put(arr1[i], i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        /*for (Map.Entry<Integer, Integer> pair : viMap.entrySet()) {
            Integer index = pair.getKey();
            Integer value = pair.getValue();
            for (int i = 0; i < n; i ++) {
                if (arr1[i] == value) {
                    res[index] = list2[i];
                    break;
                }
            }
        }*/
        for(int i = 0; i<n; i++){
            int index = viMap.get(arr1[i]);
            res.set(index ,arr2[i]);
        }

        return res;
    }
}