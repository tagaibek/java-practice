package acmp.problemHack;

import acmp.utils.AdylUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Datelines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = AdylUtils.readInt();
        String result = "";
        for (int i = 0; i < num; i++) {
            String s = reader.readLine();
            try {
                result += getBits(s);
            } catch (Exception e) {
                result +="\n"+ s + " can't be fitted anywhere.";
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

        if ((l >= -9223372036854775808L) && (l <= 9223372036854775807L)) {
            string += "\n* Long ; ";
        }

        return string;
    }
}
