package acmp.coderbyte;


import java.util.Scanner;

public class ConverterTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String result =TimeConvert(s.nextLine()) ;
        System.out.println(result);
    }

    private static String TimeConvert(String num) {
        int n = Integer.parseInt(num);
        int hour = n / 60;
        int min = n % 60;
//        for (int i = 0; i <= n; i++){
//            if (n>=60){
//                n = n-60;
//                hour++;
//            }
//            if (n<60){
//                min =n;
//            }
//            else min = n;
//        }

        return Integer.toString(hour)+ ":"+ Integer.toString(min);
    }

}
