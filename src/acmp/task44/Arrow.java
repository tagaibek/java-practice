package acmp.task44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Arrow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String srting = reader.readLine();
        char[] chars = srting.toCharArray();
        int d = 0;
        for (int i = 0; i < chars.length-4; i++) {
            if ((chars[i] == '>' && chars[i + 1] == '>' && chars[i + 2] == '-' && chars[i + 3] == '-' && chars[i + 4] == '>')
                    ||(chars[i] == '<' && chars[i+1] == '-' && chars[i+2] == '-' && chars[i+3] == '<' && chars[i+4] == '<')) {
                d++;
            }
        }
        System.out.println(d);
    }
}
