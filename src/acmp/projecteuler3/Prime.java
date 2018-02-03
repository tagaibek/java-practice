package acmp.projecteuler3;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    //private static final Long number = 600851475143L;

    private static final Long number = 13195L;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        List<Long> primeNumbers = getPrimeNumbers();
        long maxPrimeFactor = getMaxPrimeFactor(primeNumbers);
        System.out.println(maxPrimeFactor);

        System.out.println("completed in: " + (System.currentTimeMillis() - start) + "ms");

    }

    private static List<Long> getPrimeNumbers() {
        List<Long> list = new ArrayList<>();
        for (long i = 3; i <= number; i += 2) {
            boolean ok = true;
            for (long j = 3; j < i; j++) {
                if (i % j == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                list.add(i);
            }
        }

        return list;
    }

    private static long getMaxPrimeFactor(List<Long> list) {
        long max = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (number % list.get(i) == 0) {
                max = list.get(i);
                break;
            }
        }

        return max;
    }
}
