package home_tasks;

import java.util.Scanner;

public class Female {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sumGreenfly(sc.nextInt());
        System.out.println(result);
        System.out.println(" ");
    }

    /*
    private static int sumGreenfly2(int days){
        int result = 1;
        for(int d = 0; d < days; d++){
            int tmp = Math.pow(8, )
        }
    }
    */

    private static int sumGreenfly(int days) {
        int result = 0;
        for (int i = 0; i < days; i++) {
            if (i < 7){
                result += 8;
            }
            else if (i < 14){
                result += 8 + 8 * 8;
            }
            else if ( i < 21){
                result += 8 + (8 * 8) + ((8 * 8) * 8);
            }
            else if (i < 28){
                result += 8 +(8 * 8) + ((8 * 8) * 8) + (((8 * 8) * 8) * 8);
            }
        }
        return result + 1;
    }
}
