package home_tasks;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountInvest = sc.nextInt();
        int rateOfInterest = sc.nextInt();
        int years = sc.nextInt();

        int result; //= futureValue(amountInvest,rateOfInterest,years);
        result = ((amountInvest * rateOfInterest)/ 100);

        result = result * years;
        result = result + amountInvest;
        System.out.println(result);
    }

    private static int futureValue(int amountInvest, int rateOfInterest, int years) {

        return 0;
    }
}
