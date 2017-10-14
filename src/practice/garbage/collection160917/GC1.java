package practice.garbage.collection160917;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/**
 * Created by Adyl on 16.09.2017.
 */
public class GC1 {
    public static void main(String[] args) throws InterruptedException {
        rec1();
    }

    static int counter = 0;

    static WeakHashMap<Integer, Adyl> adyls = new WeakHashMap<>();

    private static void rec1() throws InterruptedException {

        for(int i= 0; i<100000; i++){
            adyls.put(++counter, new Adyl());
            System.out.println("created adyl number = " + counter);
        }

        Thread.sleep(2000);
        rec1();
    }

    public static class Adyl{
        int age = 24;
        String goal = "Coming to US when 25";
    }
}
