package acmp.task642;

import acmp.utils.AdylUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;


public class Business {
    public static void main(String[] args) throws IOException {
        int[] enterNum = AdylUtils.readIntArray();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = enterNum[0];
        int sumS = enterNum[1];
        String s = reader.readLine();

        String[] strings = new String[count-1];
        strings = s.split(" ");
        int[] carPrices = new int[strings.length];
        for (int j = 0; j < strings.length; j++) {
            carPrices[j] = Integer.parseInt(strings[j]);
        }

        int result = getCountCar(carPrices, sumS);
        System.out.println(result);
    }

    private static int getCountCar(int[] carPrices, int sumS) {
        int sum = 0;
        for (int i = 0; i < carPrices.length; i++) {
            int min = carPrices[i];
            int min_i = i;
            for (int j = i + 1; j < carPrices.length; j++) {
                if (carPrices[j] < min) {
                    min = carPrices[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = carPrices[i];
                carPrices[i] = carPrices[min_i];
                carPrices[min_i] = tmp;
            }
        }
        int sum2 = 0;
        for (int i : carPrices) {
            sum += i;
            if (sumS >= sum) {
                sum2++;
            }
        }
        return sum2;
    }
}
