package openkattis.speedLimit;

import java.util.*;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int distance = 0;
        int previous_time = 0;
        if (n >= 1 && n <= 10){
            for (int i = 0; i < n ; i++) {
                int s = sc.nextInt();
                int t = sc.nextInt();

                if (s >= 1 && s <= 90 && t >= 1 && t <= 12){
                    distance += s * (t - previous_time);
                    previous_time = t;
                }
                else break;
            }
        }

        System.out.println(distance + " miles");
    }
}
