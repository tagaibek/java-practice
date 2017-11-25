package acmp.problemHack;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Datelines {
    public static void main(String[] args) throws IOException {
        int num = AdylUtils.readInt();
        long[] number = new long[num];
        for (int i = 0; i <number.length;i++){
            long ints = AdylUtils.readInt();
            number[i]=ints;
        }
        String result = getBits(number);
        System.out.println(result);

    }

    private static String getBits(long[] number) {
        String string = "";
        for ( long i : number){
            if (i >= -128 && i <=127){
                string += i+ "* byte ; " ;

            }
            if ( i >= -32768 && i <= 32767){
                string += i + "* short ; ";
            }
            if ( i >= -2147483648 && i <= 2147483647){
                string += i + "* int ; ";
            }

            if ((i >= -922337203L) && (i <=922337203L )){
                string += i + "* int ; ";
            }
        }
        return string;
    }
}
