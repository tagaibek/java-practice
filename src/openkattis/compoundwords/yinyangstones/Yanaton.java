package openkattis.compoundwords.yinyangstones;

import java.util.Objects;
import java.util.Scanner;

public class Yanaton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] value = sc.nextLine().split("");
        int result;
        if (value.length % 2 == 0) {
            int countW = 0;
            int countB = 0;
            for (int i = 0; i < value.length; i++) {
                if (Objects.equals(value[i], "W")) {
                    countW++;
                } else if (Objects.equals(value[i], "B")) {
                    countB++;
                }
            }
            if (countW == countB) {
                result = getResult(value);
            } else {
                result = 0;
            }
        } else {
            result = 0;
        }
        System.out.println(result);

    }

    private static int getResult(String[] value) {

        return Integer.parseInt(null);
    }
}
