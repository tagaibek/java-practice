package acmp.task691;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class BusNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(getTest(s));
    }

    private static String getTest(String s) {
        String[] arrStin =s.split("");
        String yes = "";
        String no = "";
        // A, B, C, E, H, K, M, O, P, T, X, Y.
        String[] strings = {"A","B","C","E","H","M","O","P","T","X","Y"};
        //0<9
        String[] ints = {"1","2","3","4","5","6","7","8","9"};
        for (String string2 : strings) {
            if (Objects.equals(arrStin[0], string2)) {
                for (String string : strings) {
                    if (Objects.equals(arrStin[4], string)) {
                        for (String string1 : strings) {
                            if (Objects.equals(arrStin[5], string1)) {
                                yes = "Yes";
                            }
                        }
                    }
                }
            } else no = "No";

        }
        for (String in:ints){
            if (Objects.equals(arrStin[1],in)){
                for (String in1:ints){
                    if (Objects.equals(arrStin[2],in1)){
                        for (String in3:ints){
                            if (Objects.equals(arrStin[3],in3)){
                                yes =yes+"Yes";
                            }
                            }
                        }
                    }
            }
        }
        if (Objects.equals(yes, "YesYes")){
            return "Yes";
        }
        else
            return no;



    }
}
