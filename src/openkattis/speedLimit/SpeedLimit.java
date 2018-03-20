package openkattis.speedLimit;

import java.util.*;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> speed = new ArrayList<>();
        List<Integer> time = new ArrayList<>();
        if (n >= 1 && n <= 10){
            for (int i = 0; i < n ; i++) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                if (s >= 1 && s <= 90 && t >= 1 && t <= 12){
                    speed.add(s);
                    time.add(t);
                }
                else break;
            }
        }
        int[] result = getMiles(speed,time);
        for (int i : result){
            System.out.println(i + " miles");
        }
    }

    private static int[] getMiles(List<Integer> speed,List<Integer> time) {
        List<Integer> time1 = new ArrayList<>();
        for ( int index : time) {
            time1.add(index);
        }
        for (int i = 0; i < time.size()-1; i++) {
            int t = time.get(i);
            int t3 = time.get(i+1);
            int t1 = (t3 - t);
            time1.set(i+1,t1);

        }
        int sum = 0;
        int[] result = new int[speed.size()];
        for (int i = 0; i < speed.size() ; i++) {
            sum = (time1.get(i) * speed.get(i));
            result[i] = sum;
        }

        return result;
    }
}
