package hackerrank;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {
            int index = 0;
            int speed = alice[i];
            for (int k = 0; k < scores.length; k++) {
                if (speed < scores[k]){
                    index = k;
                }
            }
            if (index == 0){
                result[i] = 1;
            }
            else result[i] = index;

        }
        /*for (int i = 0; i < alice.length; i++) {
            int speed = alice[i];
            for (int j = 0; j < scores.length ; j++) {
                if (speed < scores[j]) {
                    index = j + 1;
                } else if (speed == scores[j]) {
                    index = j + 1;
                }
            }

            int count = 0;
            for (int j = 0; j < scores.length; j++) {
                int similar = scores[j];
                for (int l = j + 1; l < scores.length; l++) {
                    if (similar == scores[l]) {
                        count++;
                    }
                }
            }
            if (speed > scores[0]){
                result[i] = 1;
            }
            else result[i] = (index - count) + 1;
        }*/
        return result;

    }

    public static void main(String[] args) throws IOException {

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);
        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}

