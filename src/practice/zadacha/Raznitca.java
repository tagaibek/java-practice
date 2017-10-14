package practice.zadacha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 12.06.2017.
 */
public class Raznitca {
    public static void main(String[] args) {
        Zarplata zarplata = new Zarplata("Vasa",30000);
        Zarplata zarplata1 = new Zarplata("Petya",40000);
        Zarplata zarplata2 = new Zarplata("Ira",50000);

        List<Srednee> srednees = new ArrayList<>();
        srednees.add(zarplata);
        srednees.add(zarplata1);
        srednees.add(zarplata2);

        printRaznitca(srednees);

    }

    public static void printRaznitca(List<Srednee> srednees){
        int max = 0;
        for (Srednee srednee:srednees){
            if (srednee.getZarplata()>max){
                max = srednee.getZarplata();
            }
        }
        int min = max;
        for (Srednee srednee:srednees){
            if (srednee.getZarplata() < min) {
                min =srednee.getZarplata();
            }
        }
        int raznitca = 0;
        raznitca = max-min;
        System.out.println(raznitca);
    }
}
