package openkattis.compoundwords.yinyangstones;

import java.util.Scanner;

public class YingYangStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] value = sc.nextLine().toCharArray();
        int result;
        if (value.length % 2 == 0) {
            int countW = 0;
            int countB = 0;
            for (int i = 0; i < value.length; i++) {
                if (value[i] == 'W') {
                    countW++;
                } else if (value[i] == 'B') {
                    countB++;
                }
            }
            if (countB == countW) {
                result = 1;
            } else {
                result = 0;
            }
        } else {
            result = 0;
        }
        System.out.println(result);
    }

}
