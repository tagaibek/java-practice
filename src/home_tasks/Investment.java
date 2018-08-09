package home_tasks;

import java.util.Scanner;


public class Investment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amountInvest = sc.nextInt();
        double rateOfInterest = sc.nextInt();
        int years = sc.nextInt();
        double result = monthlyCompound(amountInvest,rateOfInterest,years);
        System.out.println(result);
    }

    private static double monthlyCompound(double amountInvest, double rateInterest, int years){
        for (int i = 0; i < years * 12; i++) {
            amountInvest += Math.round(((amountInvest * rateInterest)/12)) / 100.;
        }
        return amountInvest;
    }
    private static double dailyCompound(int amountInvest, double rateOfInterest, int years) {
        int mon;
        double sumYear = 0;
        for (int i = 1; i < 13 ; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12){
                mon = 31;
            }
            else if (i == 2){
                mon = 28;
            }
            else mon = 30;
            sumYear += (amountInvest * rateOfInterest * mon / 365) / 100;
        }
        sumYear = sumYear * years + amountInvest;
        return sumYear ;
    }
}
