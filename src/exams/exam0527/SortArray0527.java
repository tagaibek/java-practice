package exams.exam0527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * Created by Student on 27.05.2017.
 */
public class SortArray0527 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("enter a number less than 1000: ");
            array[i] = Integer.parseInt(reader.readLine());
        }

        sortArray(array);
    }
    public static void sortArray(int[] array){
        System.out.println(Arrays.toString(array));
        ArrayList<Integer> arrayList =new ArrayList<>();
        for (int ignore = 0; ignore<array.length; ignore++){

            //finding index of minimum
            int minIndex = 0;
            for (int i = 0; i<array.length; i++){
                if (array[i]< array[minIndex] ){
                    minIndex = i;
                    System.out.println("minIndex = " + minIndex);
                 }
            }

            arrayList.add(array[minIndex]);
            array[minIndex] = 1000;
        }

        System.out.println(arrayList);
    }

}


