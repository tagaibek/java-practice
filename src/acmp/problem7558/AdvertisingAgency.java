package acmp.problem7558;

import java.util.Scanner;

public class AdvertisingAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] requests = new int[100];
        int result = numberOfRejections(requests, sc);
        System.out.println(result);
    }

    private static int numberOfRejections(int[] requests, Scanner sc) {
        int k = 0;
        for (int i = 1; i <= 50; i++) {
            int req = sc.nextInt();
            String str = Integer.toString(req);
            if (str.equals(" ")){
                break;
            }
            else {
                req = Integer.parseInt(str);
                if (i == req) {
                    requests[i] = req;
                } else k++;
            }


        }
        return k;
    }
}
