package exams.exam0530;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Student on 30.05.2017.
 */
public class CharCounter {

    public static void main(String[] args) {
        String[] strings={"a","b","c","e","e","e"};

        CharCounter charCounter = new CharCounter();
        //calling non-static method
        charCounter.callOtherCounter(strings);

        //calling member static method
        countChars(strings);
    }

    public void callOtherCounter(String[] array){
        Count count = new Count();
        //calling non-static method of external class
        count.printCount(array);
    }

    public static void countChars(String[] array){
        HashMap<String, String> map = new HashMap<>();

        for(String ch: array){
            if(map.containsKey(ch)){
                String currentValue = map.get(ch);
                map.put(ch, currentValue + "*");
            } else {
                map.put(ch, "*");
            }
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry: entries){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
