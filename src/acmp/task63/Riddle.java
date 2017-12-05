package acmp.task63;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int p = sc.nextInt();
        int rid = 0;
        int rid2 = 0;
        for (int i = 1; i < s; i++){
            if ((s-i) * i == p){
                rid = i;
                rid2 = s-i;
                break;
            }
        }
        System.out.println(rid + " " + rid2);
    }
}
