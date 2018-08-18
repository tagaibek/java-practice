package codeabbey;
import java.util.Scanner;

public class TrickyPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = getResult(sc.nextInt());
        System.out.println(s);
    }

    private static String getResult(int count) {
        StringBuilder result = new StringBuilder();
        if (count >= 10) {
            int in = count / 10;
            int inn = count % 10;
            if (inn > 0) {
                int sum = in + inn;
                for (int i = 0; i < sum; i++) {
                    result.append("+");
                    if (i == in - 1) {
                        result.append(" : ");
                    }
                }
                return result + " :";
            } else {
                for (int i = 0; i < in; i++) {
                    result.append("+");
                }
                return result + " :";
            }

        } else {
            for (int i = 0; i < count; i++) {
                if (i == 5) {
                    result.append(" ");
                }
                result.append("+");
            }
            return result + " :";
        }
    }
}
