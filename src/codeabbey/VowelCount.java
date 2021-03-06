package codeabbey;


import java.io.IOException;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strings = new String[num];
        for (int i = 0; i < num; i++){
            String string = sc.nextLine();
            while (string.isEmpty()){
                string = sc.nextLine();
            }
            strings[i] = string;
        }
        int[] result = getCount(strings);
        System.out.println("answer:");
        for (int i : result) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
    }

    private static int[] getCount(java.lang.String[] strings) {
        int[] result = new int[strings.length];
        for (int i = 0 ; i < strings.length; i++) {
            char[] charI = strings[i].toCharArray();
            int count  = 0;
            for (int j = 0; j < charI.length; j++) {
                if (charI[j] == 'a' || charI[j] == 'o' || charI[j] == 'u' || charI[j] == 'i' ||
                        charI[j] == 'e' || charI[j] == 'y' ){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
