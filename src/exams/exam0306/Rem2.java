package exams.exam0306;

import java.util.Arrays;

/**
 * Created by Student on 06.06.2017.
 */
public class Rem2 {
    public static void main(String[] args) {
        String[] strings= {"test1", "test2", "test4"};
        Rem2 rem = new Rem2();
        rem.addElement(strings,"tex3",2);

        System.out.println(Arrays.toString(rem.addElement(strings, "text3", 2)));
    }

    public String[] addElement(String[] strings, String text, int index){
        String[] newArray = new String[strings.length + 1];
        int c = 0;
        for (int i = 0; i < strings.length; i ++) {
            if (i == index) {
                newArray[c ++] = text;
            }

            newArray[c ++] = strings[i];
        }

        if (strings.length == index) {
            newArray[c] = text;
        }

        return newArray;
    }
}
