package acmp.task15;

import java.util.Scanner;

public class MilkyWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][]ints = new int[a][a] ;
        for(int i=0; i<ints.length; i++) {
            for(int j=0; j<ints[i].length; j++) {
                int n = sc.nextInt();
                ints[i][j] = n;
            }
        }
        int k = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (ints[i]==ints[j]){
                    k++;
                }
            }
        }
        System.out.println(k);
    }
}
