package mum;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        int[] arsNum;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.isEmpty()) {
            arsNum = new int[]{};
        } else {
            String[] strings = s.split(" ");
            arsNum = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                arsNum[i] = Integer.parseInt(strings[i]);
            }
        }

        int a = findCentered(arsNum);
        System.out.println(a);
    }

    private static int findCentered(int[] arsNum) {
        if (arsNum.length % 2 == 0) {
            return 0;
        }

        int indexMid = arsNum.length / 2;
        int cen = arsNum[indexMid];
        int res = 0;
        for (int i = 0; i < arsNum.length; i++) {
            if (i != indexMid && arsNum[i] > cen) {
                 res++;
            }
        }

        return arsNum.length - 1 == res ? 1 : 0;
    }
}
