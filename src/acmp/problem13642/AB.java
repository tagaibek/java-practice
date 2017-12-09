package acmp.problem13642;

import java.util.Arrays;
import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String result =createString(n,k);
        System.out.println(result);
    }

    private static String createString(int n, int k) {
        Scanner sc = new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < n ; i++){
            string.append(sc.next());
        }
        char[] chars = string.toString().toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i]== 'A' && chars[i+1]=='B' ){
                String  b = String.valueOf(chars[i+1]);
                System.out.println(i +"," + Arrays.asList(chars).indexOf(b));
            }
        }

        return Arrays.toString(chars);
    }
}
