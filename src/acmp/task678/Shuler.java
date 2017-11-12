package acmp.task678;
import acmp.utils.AdylUtils;

import java.io.IOException;


public class Shuler {
    public static void main(String[] args) throws IOException {
        String string = AdylUtils.readString();
        int result = getNumber(string);

        System.out.println(result);
    }

    private static int getNumber(String string) {
        char[] moves = string.toCharArray();
        int position = 1;

        for (char move : moves){
            if (move == 'A' && position!=3){
                position = position == 1 ? 2:1;
            }
            else if (move == 'B' && position!=1){
                position = position == 3 ? 2:3;
            }
            else if (move == 'C' && position!=2){
                position = position ==1 ? 3:1;
            }
        }
        return position;
    }
}
