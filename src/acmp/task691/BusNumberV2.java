package acmp.task691;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class BusNumberV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result = getTest(s);

        System.out.println(result);
    }

    private static String getTest(String s) {
        char[] busChars = s.toCharArray();
        List<Character> chars = Arrays.asList('A', 'B', 'C', 'E', 'H', 'M', 'O', 'P', 'T', 'X', 'Y');
        List<Character> ints = Arrays.asList('1','2','3','4','5','6','7','8','9');

        if(chars.contains(busChars[0]) && (chars.contains(busChars[4])) && chars.contains(busChars[5])
                && (ints.contains(busChars[1])) && ints.contains(busChars[2]) && (ints.contains(busChars[3]))){
            return "yes";
        }

        return "no";
    }
}
