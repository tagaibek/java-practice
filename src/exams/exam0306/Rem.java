package exams.exam0306;


import java.util.Arrays;


/**
 * Created by Student on 03.06.2017.
 */
public class Rem {
    public static void main(String[] args) {
        String[] strings= {"test1", "test2", "test3"};
        Rem rem =new Rem();
        rem.removeElement(strings,2);

        System.out.println(Arrays.toString(rem. removeElement(strings,2 )));
    }

    public String[]  removeElement(String[] strings,int index  ){
        String[] newArray = new String[strings.length - 1];
        int c = 0;
        for (int i = 0; i < strings.length; i ++) {
            if (i != index) {
                newArray[c ++] = strings[i];
            }
        }

        return newArray;
    }

}
