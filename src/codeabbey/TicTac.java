package codeabbey;


import java.util.Scanner;

public class TicTac {
    private static int[][] map = new int[3][3];
    private static Scanner sc = new Scanner(System.in);

    public static void initMap() {
        int c = -9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = c;
                c++;
            }
        }
    }

    public static void main(String[] args) {
        int[] results = new int[sc.nextInt()];
        for (int i = 0; i < results.length; i++) {
            initMap();
            int[] intsX = new int[9];
            for (int j = 0; j < 9; j++) {
                intsX[j] = sc.nextInt();
            }
            results[i] = winningMove(intsX);
        }

        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int winningMove(int[] intsX) {
        for (int i = 0; i < 9; i++) {
            fill(intsX[i], i % 2);
            if (checkWin()) {
                return i + 1;
            }
        }

        return 0;
    }

    private static boolean checkWin() {
        if (map[0][0] == map[0][1] && map[0][1] == map[0][2]) {
            return true;
        }
        if (map[1][0] == map[1][1] && map[1][1] == map[1][2]) return true;
        if (map[2][0] == map[2][1] && map[2][1] == map[2][2]) return true;

        if (map[0][0] == map[1][0] && map[1][0] == map[2][0]) return true;
        if (map[0][1] == map[1][1] && map[1][1] == map[2][1]) return true;
        if (map[0][2] == map[1][2] && map[1][2] == map[2][2]) return true;

        if (map[0][0] == map[1][1] && map[1][1] == map[2][2]) return true;
        if (map[2][0] == map[1][1] && map[1][1] == map[0][2]) return true;

        return false;
    }

    private static void fill(int index, int player) {
        if (index == 1) {
            map[0][0] = player;
        }
        if (index == 2) {
            map[0][1] = player;
        }
        if (index == 3) {
            map[0][2] = player;
        }
        if (index == 4) {
            map[1][0] = player;
        }
        if (index == 5) {
            map[1][1] = player;
        }
        if (index == 6) {
            map[1][2] = player;
        }
        if (index == 7) {
            map[2][0] = player;
        }
        if (index == 8) {
            map[2][1] = player;
        }
        if (index == 9) {
            map[2][2] = player;
        }
    }

}
