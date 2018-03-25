package openkattis.disagame;

import java.util.Scanner;

public class Disegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] gunnar = new int[4];
        int[] emma = new int[4];
        for (int i = 0; i <gunnar.length ; i++) {
            gunnar[i] = sc.nextInt();
        }
        for (int i = 0; i <emma.length ; i++) {
            emma[i] = sc.nextInt();
        }
        String result = getResult(gunnar,emma);
        System.out.println(result);
    }

    private static String getResult(int[] gunnar, int[] emma) {
        int sumGunnar = 0;
        int sumEmma = 0;
        for (int i = 0; i < 4 ; i++) {
            sumGunnar += gunnar[i];
            sumEmma += emma[i];
        }
        if (sumGunnar > sumEmma){
            return "Gunnar";
        }
        else if (sumGunnar < sumEmma){
            return "Emma";
        }
        else return "Tie";
    }
}
