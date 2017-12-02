package acmp.data_types;

import acmp.utils.AdylUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = AdylUtils.readInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String s = reader.readLine();
            try {
                result.append(getBits(s));
            } catch (Exception e) {
                result.append("\n").append(s).append(" can't be fitted anywhere.");
            }
        }
        System.out.println(result);
    }

    private static String getBits(String number) {
        long l = Long.parseLong(number);
        String string = "\n" + l + " can be fitted in: ";
        if (l >= -128 && l <= 127) {
            string += "\n* byte ; ";
        }
        if (l >= -32768 && l <= 32767) {
            string += "\n* short ; ";
        }
        if (l >= -2147483648 && l <= 2147483647) {
            string += "\n* int ; ";
        }

        string += "\n* Long ; ";

        return string;
    }
}
