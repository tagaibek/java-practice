package practice.june01;

import exams.exam0529.Array;

import java.util.ArrayList;

/**
 * Created by Student on 01.06.2017.
 */
public class Spisok {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        integers.add(7);

        sts(integers);
        Spisok spisok = new Spisok();
        int result = spisok.sum(integers);
        System.out.println(result);
    }

    public static void sts(ArrayList<Integer> arrayList){
        System.out.println(arrayList);

    }

    public int sum(ArrayList<Integer> ints){
        int suma = 0;
        for (int i : ints){
            suma = suma + i;
        }
        return suma;
    }
}
