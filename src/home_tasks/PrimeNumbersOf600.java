package home_tasks;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersOf600 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 2; i < 600; i++) {
            int counter = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                } else if (counter > 1) break;
            }
            if (counter == 1) {
                integerList.add(i);
            }
        }
        int j = 10;
        for (int i : integerList) {
            if (j > 0) {
                System.out.print(i + ", ");
                j--;
            } else if (j == 0) {
                System.out.println('\n');
                j = 10;
            }

        }
    }
}
