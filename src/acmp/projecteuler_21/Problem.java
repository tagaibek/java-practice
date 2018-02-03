package acmp.projecteuler_21;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    public static void main(String[] args) {
        int sum = 10000;
        getSum(sum);
    }

    private static void getSum(int sum) {
        Map<Integer, Integer> friendsNums = new HashMap<>();
        for (int a = 1; a <= sum; a++) {
            int b = getSumOfDivisors(a);
            int t = getSumOfDivisors(b);
            if (t == a && b != a && !friendsNums.containsValue(a) && !friendsNums.containsValue(b)) {
                friendsNums.put(a, b);
            }
        }
        for (Map.Entry<Integer, Integer> pair : friendsNums.entrySet()) {
            System.out.println(pair.getKey() + " and " + pair.getValue());
        }
    }

    private static int getSumOfDivisors(int i) {
        int s = 0;
        for (int y = 1; y < i; y++) {
            if (i % y == 0) {
                s += y;
            }
        }
        return s;
    }
}
