package exams.exams2810;

import utils.AdylUtils;

import java.io.IOException;

public class Rounding {
    public static void main(String[] args) throws IOException {
         String e  = "2.7182818284590452353602875";
         int n = AdylUtils.readInt();
        System.out.println(round(e,n));
    }

    public static String round(String value,int n) {
        char[] result = new char[n+3];
        char[] chars = value.toCharArray();

        for (int i = 0;i < chars.length;i++){
            if (result.length > i){
                result[i]=chars[i];
            }
        }

        int index1  = Character.digit((result[result.length -1]),10);
        int index2 = Character.digit((result[result.length -2]),10);
        if (index1>5){
            index2= index2 +1;
        }
        String m4 = String.valueOf(index2);
        char m3 = m4.charAt(0);
        result[result.length-2]=m3;
        String s = new String(result);
        String s2 = s.substring(0,s.length()-1);
        System.out.println(s2);

        return s2;

    }
}
