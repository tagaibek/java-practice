package mum;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arrInt = new int[sc.nextInt()];

        for( int i=0; i < arrInt.length; i++) {
            arrInt[i] = sc.nextInt();
        }

        int diff = calculate(arrInt);

        System.out.println(diff);
    }

    private static int calculate(int[] arrInt) {
        if (arrInt.length == 0){
            return 0;
        }
        int result = 0;
        for (int i : arrInt) {
            if (i % 2 == 0 )
                result -= i ;
            else
                result += i;
        }

        return result;
    }
}
