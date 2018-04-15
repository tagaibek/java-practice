package codeabbeay.string;




import java.io.IOException;
import java.util.Scanner;


public class MoveString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strings = new String[num];
        int[] steps = new int[num];
        for (int i = 0; i < strings.length ; i++){
            steps[i] = sc.nextInt();
            strings[i] = sc.next();
        }

        String[] result = getString(strings,steps );
        System.out.println("answer:");
        for (String i : result) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
    }


    private static String[] getString(String[] strings,int[] steps) {
        String[] newStrings = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            char[] newChars = new char[chars.length];

            int length = chars.length;
            int step = steps[i];
            if (step > 0){
                for(int j = 0; j < length; j++){
                   if(j < step){
                       newChars[length + j - step] = chars[j];
                   } else {
                       newChars[j - step] = chars[j];
                   }
                }
                newStrings[i] = new String(newChars);
            }
            else if (step < 0){
                step = (-1 * step);
                 int step1 = length - step;
                 int m = 0;
                for(int j = 0; j < length; j++){
                    if(j > step1 - 1){
                        newChars[m++ ] = chars[j];
                    } else {
                        newChars[step + j] = chars[j];
                    }
                }
                newStrings[i] = new String(newChars);
            }

        }
        return newStrings;
    }
}
