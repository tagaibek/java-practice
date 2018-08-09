package home_tasks;

public class MaxCountDivisors {
    public static void main(String[] args) {
        int maxCount = 0;
        int maxInt = 0;

        for (int i = 1; i < 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count >= maxCount) {
                    maxCount = count;
                    if (i > maxInt) maxInt = i;
                }
            }
        }
        System.out.println(maxCount + " " + maxInt);
    }
}
